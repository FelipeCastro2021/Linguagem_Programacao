package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex34_Modularizacao_Tabuada {
	public static void main(String args[]) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		tabuada(num);
	}
	
	public static void tabuada(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
