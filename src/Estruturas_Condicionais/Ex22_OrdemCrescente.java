package Estruturas_Condicionais;

/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex05_OrdemCrescente {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        if (valor1 > valor2) {
            JOptionPane.showMessageDialog(null, valor2 + " " + valor1);
        } else {
            JOptionPane.showMessageDialog(null, valor1 + " " + valor2);
        }
    }
}
