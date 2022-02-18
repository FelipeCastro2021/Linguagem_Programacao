
import javax.swing.JOptionPane;

/**
 * @author Felipe Castro Ferreira
 */
public class Ex04_Triangulo {
    public static void main(String[] args) {
        int base, altura, triangulo;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base do triângulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do triângulo: "));
        
        triangulo = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + triangulo);
    }
}
