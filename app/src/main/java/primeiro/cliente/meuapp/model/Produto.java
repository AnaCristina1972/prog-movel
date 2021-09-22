package primeiro.cliente.meuapp.model;

import android.util.Log;

import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.repositorio.InterfaceRepositorio;

public class Produto {
  
    private  String nomeProduto;
    private  String marcaProduto;
    private  Float precoProduto;
    private  int qtdProduto;
    private  int idProduto;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public Float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }



}
