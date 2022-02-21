package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex36_Serie_1porFibonnaci {
	public static void main(String args[]) {
		int numero = 0; 
		double fibonnaci = 1, fatorial = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = i; j >= 1; j--) {
				fatorial = fatorial * j;
			}
			
			fibonnaci = fibonnaci + (1 / fatorial);
			fatorial = 1;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado da série: " + fibonnaci);
	}
}
