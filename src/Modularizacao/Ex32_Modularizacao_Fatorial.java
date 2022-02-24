package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex32_Modularizacao_Fatorial {
	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
		
		JOptionPane.showMessageDialog(null, "Fatorial de " + valor + ": " + calcularFatorial(valor));
	}
	
	public static int calcularFatorial(int valor) {
		int fatorial = 1;
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
}
