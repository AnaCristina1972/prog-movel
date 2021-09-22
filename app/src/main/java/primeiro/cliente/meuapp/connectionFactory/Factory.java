package primeiro.cliente.meuapp.connectionFactory;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import primeiro.cliente.meuapp.DataModel.ClienteDataModel;
import primeiro.cliente.meuapp.DataModel.ProdutoDataModel;
import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.model.Produto;

public class Factory extends SQLiteOpenHelper {

    public static final String BancoDados = "MyAppSell";
    public static final int VERSION = 1;
    SQLiteDatabase db;
    public Factory(Context context) {
        super(context, BancoDados, null, VERSION);
        db = getWritableDatabase();

    }




    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(ClienteDataModel.CriarTabela());//eXECUTA O sql
        Log.d(AppUtil.TAG, "onCreate: Cliente criado "+ClienteDataModel.CriarTabela());

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


}
