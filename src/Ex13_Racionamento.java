/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex13_Racionamento {
    public static void main(String[] args) {
        int quantAlimento = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alimentos (Kg): "));
        
        quantAlimento *= 1000;
        
        JOptionPane.showMessageDialog(null, "A comida durará: " + (quantAlimento / 50));
    }
}
