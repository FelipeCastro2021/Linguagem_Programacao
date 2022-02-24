package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex31_Modularizacao_QuadradosNumeros {
	public static void main(String[] args) {
		potencializar();
	}
	
	public static void potencializar() {
		for (int i = 10; i <= 150; i++) {
			System.out.println("O quadrado de " + i + " é: " + (i*i));
		}
	}
}
