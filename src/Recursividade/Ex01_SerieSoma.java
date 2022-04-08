package Recursividade;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex01_SerieSoma {
	public static void main(String[] args) {
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
		
		System.out.print(numero);
	}
	
	public static int somarRecursivo(int numero) {
		return numero == 1 ? 1 : numero + (numero + somarRecursivo(numero--));
	}
}
