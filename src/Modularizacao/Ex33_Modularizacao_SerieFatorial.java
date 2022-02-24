package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex33_Modularizacao_SerieFatorial {
	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		fatorialSequencia(number);
	}
	
	public static void fatorialSequencia(int number) {
		double fatorial = 1;
		
		for (int i = 2; i <= number ; i++) {
			double divisao = (double) 1 / i;
			fatorial = fatorial + divisao;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado da sequência fatorial: " + fatorial);
	}
}
