package primeiro.cliente.meuapp.DataModel;

public class ProdutoDataModel {
    public static  final  String TABELA = " produto";
    public static  final  String ID = "id";
    public static  final  String NOMEPROD = " nomeProd";
    public static  final  String  MARCAPRO= " marcaProd";
    public static  final  String  PRECOPROD= " precoProd";
    public static  final  String  QTDPROD= " qtdProd";

    public  static String QueryCriarTabela = "";
    public static  String CriarTabela(){

        QueryCriarTabela +=" CREATE TABLE " +TABELA+ "(";
        QueryCriarTabela +=ID+ " integer primary key autoincrement, ";
        QueryCriarTabela +=NOMEPROD+ " text, ";
        QueryCriarTabela +=MARCAPRO+ " text, ";
        QueryCriarTabela +=PRECOPROD+ " double, ";
        QueryCriarTabela +=QTDPROD+ " int ";
        QueryCriarTabela += " ) ";

        return QueryCriarTabela;
    }

}
