package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex33_SerieFatorial {
	public static void main(String[] args) {
		int number;
		double fatorial = 1;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int i = 2; i <= number ; i++) {
			double divisao = (double) 1 / i;
			fatorial = fatorial + divisao;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado da sequência fatorial: " + fatorial);
	}
}
