package primeiro.cliente.meuapp.model;

import android.util.Log;

import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.repositorio.InterfaceRepositorio;

public class Cliente {
   
    private int idCliente;
    private String nomeCliente;
    private String telefone;
    private String telefone2;

    public Cliente(String nomeCliente, String telefone) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }



}
