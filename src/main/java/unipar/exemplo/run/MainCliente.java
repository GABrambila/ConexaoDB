package unipar.exemplo.run;

import unipar.exemplo.entity.Cliente;
import unipar.exemplo.repository.clientes.RepositoryCliente;

public class MainCliente {
    public static void main(String[] args) {
        RepositoryCliente repoCliente = new RepositoryCliente();
        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        cliente.setNome("Gabriel");
        cliente.setCnpj("1416542316424654");
        cliente.setTelefone("46999999999");
        cliente.setEmail("askfhgsdfoisdfiuh");
        cliente.setSituacao("Ativo");
        cliente.setCidade("Beltrão");
        cliente.setEstado("PR");
        cliente.setCredito(5000d);

        }
    }

