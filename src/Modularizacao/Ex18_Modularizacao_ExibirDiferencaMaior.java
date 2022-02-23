package Modularizacao;

import javax.swing.JOptionPane;

public class Ex18_Modularizacao_ExibirDiferencaMaior {
	public static void main(String args[]) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));

		JOptionPane.showMessageDialog(null, "O valor maior é: " + encontrarMaior(valor1, valor2));
	}
	
	public static int encontrarMaior(int v1, int v2) {
		int diferenca = 0;
		
		if (v1 > v2) {
			diferenca = v1 - v2;
		} else {
			diferenca = v2 - v1;
		}
		
		return diferenca;
	}
}
