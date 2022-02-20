package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex24_InteiroDivisivel {
	public static void main(String[] args) {
		int valor1;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º valor: "));
		
		if (valor1 % 2 == 0 & valor1 % 3 == 0) {
			JOptionPane.showMessageDialog(null, "Valor inserido é divisível por 2 e 3");
		} else {
			JOptionPane.showMessageDialog(null, "Valor inserido não é divisível por 2 e 3");
		}
	}
}
