package primeiro.cliente.meuapp.repositorio;

import java.util.List;

public interface InterfaceRepositorio<T> {
    //Metodos para persistencia de dados no o BD

    //incluir
    public boolean salvar(T obj);
    //Alterar
    public  boolean alterar(T obj);
    //Deletar
    public boolean deletar(int id);
    //Listar
    public List<T> listar();
}
