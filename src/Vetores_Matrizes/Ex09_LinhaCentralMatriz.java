package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex09_LinhaCentralMatriz {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
					
				if (i == j) { 
					System.out.print("[ " + matriz[i][j] + " ]");
				} else {
					System.out.print("[ ]");
				}
			}
			
			System.out.println();
		}
	}
}
