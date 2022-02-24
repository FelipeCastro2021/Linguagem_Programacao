package Modularizacao;

import javax.swing.JOptionPane;

public class Ex36_Modularizacao_Serie_1porFatorial {
	public static void main(String[] args) {
		int numero; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		sequenciaFatorial(numero);
	}
	
	public static void sequenciaFatorial(int numero) {
		double fatorial = 1, sequenciaFatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = i; j >= 1; j--) {
				fatorial = fatorial * j;
			}
			
			sequenciaFatorial = sequenciaFatorial + (1 / fatorial);
			fatorial = 1;
		}
		
		JOptionPane.showMessageDialog(null, "Valor da sequência fatorial: " + sequenciaFatorial);
	}
}
