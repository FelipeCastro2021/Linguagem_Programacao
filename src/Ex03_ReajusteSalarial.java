/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;
import java.math.BigDecimal;

public class Ex03_ReajusteSalarial {
    public static void main(String[] args) {
        BigDecimal salario, reajuste;
        
        salario = new BigDecimal(JOptionPane.showInputDialog("Insira o seu salário: "));
        
        reajuste = salario.multiply(new BigDecimal("1.15"));
        
        JOptionPane.showMessageDialog(null, "O reajuste do salário é: " + reajuste);
    }
}
