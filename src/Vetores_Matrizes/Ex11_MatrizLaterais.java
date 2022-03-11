package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex11_MatrizLaterais {
	static int num;
	
	public static void main (String[] args) {
		int[][] matriz = new int[8][8];
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				int ultimoValor = matriz.length - (i);
				
				if (j == ultimoValor) {
					System.out.print("[" + i + " " + j + "]");
				} else {
					System.out.print("[ " + " ]");
				}
			}
			System.out.println();
		}
	}
}
