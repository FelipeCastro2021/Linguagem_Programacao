package Recursividade;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Aula_Recursividade {
	public static void main(String[] args) {
		int num = 0;
		
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		} catch(Exception e) {
			System.out.println("Valor inserido está incorreto!");
			e.printStackTrace();
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado do Fatorial: " + fFat(num));
	}
	
	public static int fFat(int n) {
		return n != 1 ? n * (fFat(n-1)) : 1; 
	}
}
