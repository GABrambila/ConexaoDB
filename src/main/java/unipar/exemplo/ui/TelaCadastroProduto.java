package unipar.exemplo.ui;

import unipar.exemplo.entity.Produto;
import unipar.exemplo.repository.produto.RepositoryProduto;
import unipar.exemplo.utils.Utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaCadastroProduto {
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JTextField txtEan;
    private JTextField txtPreco;
    private JButton btnCadastrar;
    public JPanel panelMain;
    private JTable tabelaProduto;


    public TelaCadastroProduto() {
        carregarDadosProduto();




    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Produto novoProduto = new Produto();
            novoProduto.setCodigo(Utils.convertInteger(txtCodigo));
            novoProduto.setNome(txtNome.getText());
            novoProduto.setEan(txtEan.getText());
            novoProduto.setPreco(Utils.convertDouble(txtPreco));

            RepositoryProduto repo = new RepositoryProduto();
            Integer retorno =  repo.inserirProduto(novoProduto);

          Utils.validarRetorno(retorno);

        }
    });
}


private void carregarDadosProduto(){

        tabelaProduto.setModel( new DefaultTableModel(null,new Object[]{"Codigo", "Nome", "Ean", "Preço"}));
        RepositoryProduto repo = new RepositoryProduto();
        List<Produto> listaProdutosBanco = repo.buscarProduto();

        DefaultTableModel tabela = (DefaultTableModel) tabelaProduto.getModel();

        listaProdutosBanco.forEach(produto -> {
            tabela.addRow(new Object[]{produto.getCodigo(),
                                       produto.getNome(),
                                       produto.getEan(),
                                       produto.getPreco()});
        });



}


}
