package Recursividade;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex01_SerieSoma {
	public static void main(String[] args) {
		int numero = 15;
		
		System.out.print(numero);
	}
	
	public static int somarRecursivo(int numero) {
		if (numero != 1) {
			numero += (somarRecursivo(numero - 1));
			return numero;
		} else {
			return 1;
		}
	}
}
