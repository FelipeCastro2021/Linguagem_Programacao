/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex17_GastoCombustível_Viagem {
    public static void main(String[] args) {
        int tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de percurso(H): "));
        double velocMedia = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média(Km): "));
        
        double distancia = tempoPercurso * velocMedia;
        
        double gastoCombustivel = distancia / 12;
        
        JOptionPane.showMessageDialog(null, "A quantidades de litros gastos é: " + gastoCombustivel);
    }
}
