package Vetores_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex12_Xadrez {
	public static void main(String[] args) {
		int[][] tabuleiro = new int[8][8];
		int[] pecas = new int[8];
		int resultado = 0;
		
		Random xadrez = new Random();
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = xadrez.nextInt(7) + 1;				
				resultado += tabuleiro[i][j];
				
				switch (tabuleiro[i][j]) {
				case 1:
					pecas[0]++;
					break;
				case 2:
					pecas[1]++;
					break;
				case 3:
					pecas[2]++;
					break;
				case 4:
					pecas[3]++;
					break;
				case 5:
					pecas[4]++;
					break;
				case 6:
					pecas[5]++;
					break;
				case 7:
					pecas[6]++;
					break;
			}
		}
		
		}
		System.out.println("Resultado: " + resultado);
		
		System.out.println("Quantidade de Peões: " + pecas[0]);
		System.out.println("Quantidade de Torres: " + pecas[1]);
		System.out.println("Quantidade de Bispos: " + pecas[2]);
		System.out.println("Quantidade de Cavalos: " + pecas[3]);
		System.out.println("Quantidade de Rainhas: " + pecas[4]);
		System.out.println("Quantidade de Reis: " + pecas[5]);
		System.out.println("Quantidade de Vazios: " + pecas[6]);
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print("[ " + tabuleiro[i][j] + " ]");
			}
			
			System.out.println();
		}
	}
}