package unipar.exemplo.dbsimples;
import java.sql.*;

public class ConexaoDbSimples {

    public static void main(String[] args) {

        conectarBancoDeDados();

    }

    public static void conectarBancoDeDados() {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "adm123";



        try {

            //INICIA A CRIAÇÃO DA CONEXÃO COM O BANCO
            Connection conn = DriverManager.getConnection(url, username, password);


            //CRIA A INTERFACE PARA CONEXÃO COM O BANCO
            //NELA VAMOS EXECUTAR: SELECT, INSERT, UPDATE, DELETE
            Statement statment = conn.createStatement();

            //EXECUTAR  UMA QUERY SQL
            ResultSet result = statment.executeQuery("SELECT * FROM produtos where codigo = 1");

            while (result.next()){
                 Integer codigo = result.getInt("codigo");
                 String nome = result.getString("nome");
                 String ean = result.getString("ean");
                 Double preco = result.getDouble("preco");



                 System.out.println("___________________");
                 System.out.println("Cadastro produto");
                 System.out.println("Código:" + codigo);
                 System.out.println("Nome:" + nome);
                 System.out.println("Ean:" + ean);
                 System.out.println("Preço:" + preco);
                 System.out.println("___________________");

            }

            conn.close();

        }catch (Exception e){
         //EXIBE O LOG DO EXCEPTION
         e.printStackTrace();
        }
    }

}
