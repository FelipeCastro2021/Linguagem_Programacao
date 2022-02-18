
import javax.swing.JOptionPane;

/**
 * @author Felipe Castro Ferreira
 */

public class Ex06_TrocaValores {
    public static void main(String[] args) {
        int x, y, aux = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        aux = x;
        x = y;
        y = aux;
        
        JOptionPane.showMessageDialog(null, "O valor de x: " + x
        + "\nO valor de y: " + y);
    }
 
}
