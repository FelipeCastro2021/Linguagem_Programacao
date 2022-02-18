/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex05_Temperatura_Celsius {
    public static void main(String[] args) {
        int celsius;
        Double fahrenheit;
        
        celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        
        fahrenheit = (double) (9 * celsius + 160) / 5;
        
        JOptionPane.showMessageDialog(null, "Temperatura em Fahreinheit: " + fahrenheit);
    }
}
