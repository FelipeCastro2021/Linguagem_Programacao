package Vetores_Matrizes;

import javax.swing.JOptionPane;

public class Ex11_MatrizLateraisProfessor {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		int[][] matriz = new int[8][8];
		
		for (z = 1; z <= 4; z++) {
			for (x = (z - 1); x <= (8 - z); x++) {
				for (y = (z - 1); y <= (8 - z); y++) {
					matriz[x][y] =  z;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
	}
}
