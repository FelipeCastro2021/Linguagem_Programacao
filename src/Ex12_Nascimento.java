/**
 * @author Felipe Castro Ferreira
 */

import javax.swing.JOptionPane;

public class Ex12_Nascimento {
    public static void main(String[] args) {
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
        
        JOptionPane.showMessageDialog(null, "Idade atual: " + (anoAtual - anoNasc) + 
                "\nIdade daqui 17 anos: " + ((anoAtual - anoNasc) + 17));
    }
}
