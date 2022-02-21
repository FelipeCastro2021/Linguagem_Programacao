package Estruturas_Condicionais;

/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex20_Equacao2Grau {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("DIgite o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("DIgite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("DIgite o coeficiente C: "));

        double delta = (b * b) - (4 * a * c);
        
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            
            JOptionPane.showMessageDialog(null, "Primeira Raíz Real: " + x1);
            JOptionPane.showMessageDialog(null, "Segunda Raíz Real: " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "Sem raízes reais");
        }
    }
}
