package unipar.exemplo.utils;
import javax.swing.*;

public class Utils {
    public static Integer convertInteger(JTextField field){
        return  Integer.valueOf(field.getText());
    }

    public static Double convertDouble(JTextField field){
        return  Double.valueOf(field.getText());
    }

    public static void validarRetorno(Integer status){
        if( status >= 1){
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO! ");
        } else {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR! ");
        }
    }
}
