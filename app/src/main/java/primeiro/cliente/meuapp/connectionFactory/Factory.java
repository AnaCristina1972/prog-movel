package primeiro.cliente.meuapp.connectionFactory;

import static primeiro.cliente.meuapp.DataModel.ClienteDataModel.*;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.meuapp.DataModel.ClienteDataModel;
import primeiro.cliente.meuapp.DataModel.ProdutoDataModel;
import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.model.Cliente;
import primeiro.cliente.meuapp.model.Produto;

public class Factory extends SQLiteOpenHelper {

    public static final String BancoDados = "MyAppSell.sqlite";
    public static final int VERSION = 1;
    SQLiteDatabase db;

    public Factory(Context context) {
        super(context, BancoDados, null, VERSION);
        Log.d(AppUtil.TAG, "MyAppSell: Criando Banco de Dados");
        db = getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(CriarTabela());//eXECUTA O sql
        Log.d(AppUtil.TAG, "onCreate: Cliente criado "+ CriarTabela());

        db.execSQL(ProdutoDataModel.CriarTabela());//eXECUTA O sql
        Log.d(AppUtil.TAG, "onCreate: Produto criado "+ ProdutoDataModel.CriarTabela());

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    /**
     * Metodo pra salvar os dados no BD
     * @return
     */
    public boolean insert(String tabela, ContentValues dados){
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.insert(tabela,null,dados) > 0;

        }catch (Exception e){
            Log.d(AppUtil.TAG, "Insert "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Metodo pra Alterar os dados no BD
     * @return
     */
    public boolean update(String tabela, ContentValues dados){
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.update(tabela,dados,"id =?", new String[] {String.valueOf(dados.get("id"))}) > 0;

        }catch (Exception e){
            Log.d(AppUtil.TAG, "update "+e.getMessage());
        }

        return retorno;
    }



    /**
     * Metodo pra Excluir os dados no BD
     * @return
     */
    public boolean deleteById(String tabela, int id){
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.delete(tabela,"id = ?",new String[] {String.valueOf(id)}) > 0;

        }catch (Exception e){
            Log.d(AppUtil.TAG, "Delete "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Metodo pra Listar os dados no BD
     * @return
     */
    @SuppressLint("Range")
    public List<Cliente> getAllClientes(String tabela){
        db = getWritableDatabase();
      List<Cliente> clientes = new ArrayList<>();
      Cliente obj;
      String sql = "SELECT * FROM "+tabela;
      Cursor cursor;
      cursor = db.rawQuery(sql,null);
        if (cursor.moveToFirst()){
            do {
                obj = new Cliente();
                obj.setId(cursor.getInt(cursor.getColumnIndex(ClienteDataModel.ID)));
                obj.setNomeCliente(cursor.getString(cursor.getColumnIndex(ClienteDataModel.NOME)));
                obj.setTelefone(cursor.getString(cursor.getColumnIndex(ClienteDataModel.TEL1)));
                obj.setTelefone2(cursor.getString(cursor.getColumnIndex(ClienteDataModel.TEL2)));
                clientes.add(obj);
                Log.i("Listar", "getAllClientes: "+obj.getNomeCliente());

            }while (cursor.moveToNext());
        }

        return clientes;
    }



}
