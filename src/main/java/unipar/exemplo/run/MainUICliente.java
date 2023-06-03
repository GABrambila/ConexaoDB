package unipar.exemplo.run;

import unipar.exemplo.ui.TelaCadastroProduto;

import javax.swing.*;

public class MainUICliente {

    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    createUI();

                }
            });
        }

    private static void createUI(){

        TelaCadastroCliente formCliente = new TelaCadastroCliente();

        JFrame frame = new JFrame();
        frame.setContentPane(formCliente.panelMain);
        frame.setTitle("CADASTRO DE CLIENTE:");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
    }
}
