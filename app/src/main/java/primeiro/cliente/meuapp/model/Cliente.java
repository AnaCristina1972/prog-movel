package primeiro.cliente.meuapp.model;

public class Cliente {
   
    private int id;
    private String nomeCliente;
    private String telefone;
    private String telefone2;

    public Cliente(String nomeCliente, String telefone) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;

    }

    public Cliente() {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
