package Estruturas_Condicionais;

/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex02_MaiorReal {
    public static void main(String[] args) {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor real: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor real: "));
        
        if (valor1 > valor2) {
            JOptionPane.showMessageDialog(null, "Primeiro valor: " + valor1);
        } else {
            JOptionPane.showMessageDialog(null, "Segundo valor: " + valor2);
        }
    }
}
