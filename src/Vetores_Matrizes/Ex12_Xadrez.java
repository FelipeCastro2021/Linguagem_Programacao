package Vetores_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex12_Xadrez {
	public static void main(String[] args) {
		int[][] tabuleiro = new int[8][8];
		int resultado = 0;
		
		Random xadrez = new Random();
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = xadrez.nextInt(7) + 1;				
				resultado += tabuleiro[i][j];
			}
		}
		
		System.out.println("Resultado: " + resultado);
	}
}
