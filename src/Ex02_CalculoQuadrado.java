/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex02_CalculoQuadrado {
    public static void main(String[] args) {
        int lado, area;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        
        area = lado * lado;
        
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}
