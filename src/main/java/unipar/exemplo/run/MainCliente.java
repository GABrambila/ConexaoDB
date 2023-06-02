package unipar.exemplo.run;

import unipar.exemplo.repository.clientes.RepositoryCliente;

public class MainCliente {
    public static void main(String[] args) {
        RepositoryCliente repoCliente = new RepositoryCliente();
            repoCliente.buscarCliente();
        }
    }

