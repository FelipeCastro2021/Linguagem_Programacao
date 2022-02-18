/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex15_Hipotenusa {
    public static void main(String[] args) {
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo cateto: "));
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa: " + (Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2))));
    }
}
