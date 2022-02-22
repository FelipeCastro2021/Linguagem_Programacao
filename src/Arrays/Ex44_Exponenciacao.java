package Arrays;

import javax.swing.JOptionPane;

public class Ex44_Exponenciacao {
	public static void main(String args[]) {
		int base = 0, expoente;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
	
		JOptionPane.showMessageDialog(null, "O valor da potência é: " + Math.pow(base, expoente));
	}
}
