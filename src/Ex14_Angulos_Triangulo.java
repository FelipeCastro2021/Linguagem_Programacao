/**
 * @author Felipe Castro Ferriera
 */

import javax.swing.JOptionPane;

public class Ex14_Angulos_Triangulo {
    public static void main(String[] args) {
        double angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro triângulo: "));
        double angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo triângulo: "));
        
        JOptionPane.showMessageDialog(null, "O valor do 3º ângulo: " + Math.abs((angulo1 + angulo2) - 180) + "º");
    }
}
