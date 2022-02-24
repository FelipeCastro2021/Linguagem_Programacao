package Modularizacao;

import javax.swing.JOptionPane;

public class Ex22_Modularizacao_OrdemCrescente {
	public static void main(String args[]) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor inteiro: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor inteiro: "));
		
		ordenarCrescentemente(valor1, valor2);
	}
	
	public static void ordenarCrescentemente(int v1, int v2) {
		if (v1 > v2) {
			JOptionPane.showMessageDialog(null, v1 + " " + v2);
		} else {
			JOptionPane.showMessageDialog(null, v2 + " " + v1);
		}
	}
}
