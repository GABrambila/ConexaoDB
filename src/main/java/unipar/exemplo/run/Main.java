package unipar.exemplo.run;

import unipar.exemplo.repository.produto.RepositoryProduto;

public class Main {
    public static void main(String[] args) {

        RepositoryProduto repo = new RepositoryProduto();
        repo.buscarProduto();

    }

}