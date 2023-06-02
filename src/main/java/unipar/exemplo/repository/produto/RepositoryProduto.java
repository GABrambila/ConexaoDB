package unipar.exemplo.repository.produto;

import unipar.exemplo.connection.ConnectionGeneric;

import java.sql.ResultSet;

public class RepositoryProduto {

    public void inserirProduto() {
    }

    public void alterarProduto() {
    }

    public void deletarProduto() {
    }

    public void buscarProduto() {
        ConnectionGeneric connection = new ConnectionGeneric();

        try {
            connection.getConnection();
            String query = "SELECT * FROM produtos";
            ResultSet result = connection.statement.executeQuery(query);

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
            connection.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
