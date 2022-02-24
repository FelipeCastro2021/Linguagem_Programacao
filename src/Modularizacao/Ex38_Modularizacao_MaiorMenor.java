package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex38_Modularizacao_MaiorMenor {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		
		maiorMenor100(numeros);
	}
	
	public static void maiorMenor100(int[] numeros) {
		int maior = 0, menor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite um número: "));
		
			if (i == 0) {
				maior = numeros[0];
				menor = numeros[0];
			}
			
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior número: " + maior 
				+"\nMenor número: " + menor);
	}
}
