package Estruturas_Condicionais;

/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex21_NotasBimestrais {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota: "));
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media >= 3) {
            JOptionPane.showMessageDialog(null, "Exame");
        } else {
            JOptionPane.showMessageDialog(null, "Retido");
        }
    }
}
