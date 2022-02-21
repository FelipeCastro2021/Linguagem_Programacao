
import javax.swing.JOptionPane;

/**
 * @author Felipe Castro Ferreira
 */

public class Ex07_Paralelep�pido {
    public static void main(String[] args) {
        double comprimento, altura, largura;
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelepípedo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do paralelepípedo: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do paralelepípedo: "));
        
        JOptionPane.showMessageDialog(null, "Volume do paralelepípedo: " + (comprimento * altura * largura));
    }
 
}
