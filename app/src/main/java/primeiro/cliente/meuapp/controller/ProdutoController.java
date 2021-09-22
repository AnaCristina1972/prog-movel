package primeiro.cliente.meuapp.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.meuapp.DataModel.ProdutoDataModel;
import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.connectionFactory.Factory;
import primeiro.cliente.meuapp.model.Produto;
import primeiro.cliente.meuapp.repositorio.InterfaceRepositorio;

public class ProdutoController extends Factory implements InterfaceRepositorio<Produto> {

    ContentValues dados;

    public ProdutoController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ProdutoController: conectado");
    }


    @Override
    public boolean salvar(Produto obj) {
        dados =new ContentValues();
        dados.put(ProdutoDataModel.NOMEPROD,obj.getNomeProduto());
        dados.put(ProdutoDataModel.MARCAPRO,obj.getMarcaProduto());
        dados.put(ProdutoDataModel.PRECOPROD,obj.getPrecoProduto());
        dados.put(ProdutoDataModel.QTDPROD,obj.getQtdProduto());
        return insert(ProdutoDataModel.TABELA,dados);
    }

    @Override
    public boolean alterar(Produto obj) {
        dados =new ContentValues();
        dados.put(ProdutoDataModel.ID,obj.getIdProduto());
        dados.put(ProdutoDataModel.NOMEPROD,obj.getNomeProduto());
        dados.put(ProdutoDataModel.MARCAPRO,obj.getMarcaProduto());
        dados.put(ProdutoDataModel.PRECOPROD,obj.getPrecoProduto());
        dados.put(ProdutoDataModel.QTDPROD,obj.getQtdProduto());
        return true;
    }

    @Override
    public boolean deletar(Produto obj) {
        dados =new ContentValues();
        dados.put(ProdutoDataModel.ID,obj.getIdProduto());

        return true;
    }

    @Override
    public List<Produto> listar(Produto obj) {
        List<Produto> listarPro=new ArrayList<>();
        return null;
    }
}
