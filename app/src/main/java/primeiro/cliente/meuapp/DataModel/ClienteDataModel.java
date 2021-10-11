package primeiro.cliente.meuapp.DataModel;

public class ClienteDataModel  {

    //nome da tabela
    public static final String TABELA = " cliente ";

    //atributos da tabela
    public static final String ID = "id";
    public static final String NOME = "nomeCliente";
    public static final String TEL1 = "telCliente1";
    public static final String TEL2 = "telCliente2";

    //Query para criar a tabela
    public static  String QueryCriarTabela = "";

    //metodo para criar a tabela
    public static String CriarTabela(){

        // concatenacao de String
        QueryCriarTabela += "CREATE TABLE "+TABELA+" (";
        QueryCriarTabela += ID+" integer primary key autoincrement, ";
        QueryCriarTabela += NOME+" text, ";
        QueryCriarTabela += TEL1+" text, ";
        QueryCriarTabela += TEL2+" text ";
        QueryCriarTabela += ")";


        return QueryCriarTabela;


    }



}
