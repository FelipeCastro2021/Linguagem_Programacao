
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Castro Ferreira
 */

public class Ex10_DiferencaReais {
    public static void main(String[] args) {
        double real1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro real: "));
        double real2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo real: "));
        
        JOptionPane.showMessageDialog(null, "A diferença entre os valores reais é: " + (real1 - real2));
    }
}
