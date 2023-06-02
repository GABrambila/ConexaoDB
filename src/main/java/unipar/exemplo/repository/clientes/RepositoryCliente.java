package unipar.exemplo.repository.clientes;

import unipar.exemplo.connection.ConnectionGeneric;

import java.sql.ResultSet;

public class RepositoryCliente {

            public void buscarCliente() {
            ConnectionGeneric connection = new ConnectionGeneric();

            try {
                connection.getConnection();
                String query = "SELECT * FROM clientes";
                ResultSet result = connection.statement.executeQuery(query);

                while (result.next()){
                    Integer IDcliente = result.getInt("IDcliente");
                    String nome = result.getString("nome");
                    String cnpj = result.getString("cnpj");
                    String telefone  = result.getString("telefone");
                    String email = result.getString("email");
                    String situacao = result.getString("situacao");
                    String cidade = result.getString("cidade");
                    String estado = result.getString("estado");
                    Double credito = result.getDouble("credito");


                    System.out.println("____________________________________");
                    System.out.println("Cadastro Cliente");
                    System.out.println("IDcliente:" + IDcliente);
                    System.out.println("Nome:" + nome);
                    System.out.println("cnpj:" +  cnpj);
                    System.out.println("telefone:" + telefone);
                    System.out.println("email:" + email);
                    System.out.println("situacao:" + situacao);
                    System.out.println("cidade:" + cidade);
                    System.out.println("estado:" + estado);
                    System.out.println("credito:" + credito);
                    System.out.println("_____________________________________");
                }
                connection.closeConnection();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

