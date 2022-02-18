
import javax.swing.JOptionPane;

/**
 * @author FATEC ZONA LESTE
 */

public class Ex09_SomaQuadrados {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segunda valor: "));
        
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + ((num1 * num1) +(num2 * num2)));
    }
}
