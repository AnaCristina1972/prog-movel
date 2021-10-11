package primeiro.cliente.meuapp.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.meuapp.DataModel.ClienteDataModel;
import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.connectionFactory.Factory;
import primeiro.cliente.meuapp.model.Cliente;
import primeiro.cliente.meuapp.repositorio.InterfaceRepositorio;

public class ClienteController extends Factory implements InterfaceRepositorio<Cliente>{
    ContentValues dados;
    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }


    @Override
    public boolean salvar(Cliente obj) {
        dados = new ContentValues();
        dados.put(ClienteDataModel.NOME,obj.getNomeCliente());
        dados.put(ClienteDataModel.TEL1,obj.getTelefone());
        dados.put(ClienteDataModel.TEL2,obj.getTelefone2());
    return insert(ClienteDataModel.TABELA,dados);

    }


    @Override
    public boolean deletar(int id) {

        return deleteById(ClienteDataModel.TABELA,id);
    }

    @Override
    public boolean alterar(Cliente obj) {
        dados = new ContentValues();
        dados.put(ClienteDataModel.ID,obj.getId());
        dados.put(ClienteDataModel.NOME,obj.getNomeCliente());
        dados.put(ClienteDataModel.TEL1,obj.getTelefone());
        dados.put(ClienteDataModel.TEL2,obj.getTelefone2());
        return update(ClienteDataModel.TABELA,dados);
    }



    @Override
    public List<Cliente> listar() {

       List<Cliente> lista=new ArrayList<>();

       return getAllClientes(ClienteDataModel.TABELA);
    }
}
