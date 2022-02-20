package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex31_QuadradosNumeros {
	public static void main(String[] args) {
		for (int i = 10; i <= 150; i++) {
			JOptionPane.showMessageDialog(null, "O quadrado de " + i + " é: " + (i*i));
		}
	}
}
