package Modularizacao;

import javax.swing.JOptionPane;

public class Ex23_Modularizacao_Sequencia_4Aleatorio {
	public static void main(String args[]) {
		int numero1, numero2, numero3, numero4;
		
		numero1 = 0;
		numero2 = 2;
		numero3 = 4;
		
		numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		ordenar4Numero(numero1, numero2, numero3, numero4);
	}
	
	public static void ordenar4Numero(int n1, int n2, int n3, int n4) {
		if (n4 < n1) {
			JOptionPane.showMessageDialog(null, n4 + " " + n1 + " " + n2 + " " + n3);
		} else if (n4 < n2) {
			JOptionPane.showMessageDialog(null, n1 + " " + n4 + " " + n2 + " " + n3);
		} else if (n4 < n3) {
			JOptionPane.showMessageDialog(null, n1 + " " + n2 + " " + n4 + " " + n3);
		} else {
			JOptionPane.showMessageDialog(null, n1 + " " + n2 + " " + n3 + " " + n4);
		}
	}
}
