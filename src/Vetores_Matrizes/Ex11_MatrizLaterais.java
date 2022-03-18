package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex11_MatrizLaterais {
	static int num;
	
	public static void main (String[] args) {
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print("[ " + (i+1) + " ]");
				} else {
					System.out.print("[ 0 ]");
				}
			}
			System.out.println();
		}
	}
}
