package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex24_Modularizacao_InteiroDivisivel {
	public static void main(String[] args) {
		int valor1;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� valor: "));
		
		dividir(valor1);
	}
	
	public static void dividir(int v1) {
		if (v1 % 2 == 0 & v1 % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Valor inserido � divis�vel por 2 e 3");
		} else {
			JOptionPane.showMessageDialog(null, "Valor inserido n�o � divis�vel por 2 e 3");
		}
	}
}
