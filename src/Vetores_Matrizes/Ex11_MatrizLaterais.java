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
				if (i == 0 || j == 0 || i == (matriz.length - 1) || j == (matriz.length - 1)) {
					System.out.print("[ 1 ]");
				} else if (i == 1 || j == 1 || i == (matriz.length - 2) || j == (matriz.length - 2)) {
					System.out.print("[ 2 ]");
				} else if (i == 2 || j == 2 || i == (matriz.length - 3) || j == (matriz.length - 3)) {
					System.out.print("[ 3 ]");
				} else if (i == 3 || j == 3 || i == (matriz.length - 4) || j == (matriz.length - 4)) {
					System.out.print("[ 4 ]");
				}
			}
			System.out.println();
		}
	}
}
