package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex10_SomaValores {
	public static void main(String args[]) {
		int[][] quantidade = new int[3][3];
		int resultado = 0;
		
		for (int i = 0; i < quantidade.length; i++) {
			for (int j = 0; j < quantidade[i].length; j++) {
				if (j == 0 && i == 0) {
					quantidade[i][j] = 1;
				} else if (i > 0 && j == 0) {
					quantidade[i][j] = quantidade[i - 1][quantidade.length - 1] * 2;
				} else {
					quantidade[i][j] = quantidade[i][j-1] * 2;
				}
				
				resultado += quantidade[i][j];
				
				System.out.print(quantidade[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
