
import javax.swing.JOptionPane;

/**
 * @author Felipe Castro Ferreira
 */

public class Ex05_Equacao2Grau {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente c: "));

        delta = (b * b) - (4 * a * c);
        
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        JOptionPane.showMessageDialog(null, "Sua 1º raiz é: " + x1
        + "\nSua 2º raiz é: " + x2);
    }
 
}
