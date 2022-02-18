
import javax.swing.JOptionPane;

/**
 * @author FATEC ZONA LESTE
 */
public class Ex08_Poupanca {
    public static void main(String[] args) {
        double deposito, rendimento;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito na poupança: "));
        
        rendimento = deposito * 1.013;
        
        JOptionPane.showMessageDialog(null, "O valor do rendimento desse mês na poupança é: " + rendimento);
    }
}
