package unipar.exemplo.repository.produto;

import unipar.exemplo.connection.ConnectionGeneric;
import unipar.exemplo.entity.Produto;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProduto {

    public Integer inserirProduto(Produto produto){

        try {

        ConnectionGeneric connection = new ConnectionGeneric();
        connection.getConnection();


        String query = "INSERT INTO produtos (codigo, nome, ean, preco)"+
        "VALUES ("+produto.getCodigo()+", '"+produto.getNome()+"' ,  '"+produto.getEan()+"' ,"+produto.getPreco()+")";
        connection.statement.executeUpdate(query);

            System.out.println(query);
            Integer retorno = connection.statement.executeUpdate(query);
            connection.closeConnection();
            return retorno;

    }catch(Exception e)
    {
        e.printStackTrace();
        return 0;
    }

}


    public void alterarProduto() {
    }

    public void deletarProduto() {
    }

    public List<Produto> buscarProduto() {
        ConnectionGeneric connection = new ConnectionGeneric();

        try {
            List<Produto> listaRetorno = new ArrayList<>();
            connection.getConnection();
            String query = "SELECT * FROM produtos";
            ResultSet result = connection.statement.executeQuery(query);

            while (result.next()){
                //RETORNA DADOS DO BANCO
                Integer codigo = result.getInt("codigo");
                String nome = result.getString("nome");
                String ean = result.getString("ean");
                Double preco = result.getDouble("preco");

                //JOGA OS DADOS EM OBJETO PRODUTO
                Produto produtoBanco = new Produto();
                produtoBanco.setCodigo(codigo);
                produtoBanco.setNome(nome);
                produtoBanco.setEan(ean);
                produtoBanco.setPreco(preco);

                //GUARDA O OBJETO NA LISTA RETORNO
                listaRetorno.add(produtoBanco);


                /*System.out.println("___________________");
                System.out.println("Cadastro produto");
                System.out.println("Código:" + codigo);
                System.out.println("Nome:" + nome);
                System.out.println("Ean:" + ean);
                System.out.println("Preço:" + preco);
                System.out.println("___________________");*/
            }
            connection.closeConnection();
            return listaRetorno;

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

