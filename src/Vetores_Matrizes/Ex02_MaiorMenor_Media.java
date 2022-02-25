package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex02_MaiorMenor_Media {
	public static void main(String[] args) {
		int[] valores = new int[100];
		int maior = 0, menor = 0, i = 0;
		double media = 0;
		
		for (i = 0; i < valores.length; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
			
			if (i == 0) {
				maior = valores[0];
				menor = valores[0];
			}
			
			if (maior < valores[i]) {
				maior = valores[i];
			} 
			
			if (menor > valores[i]) {
				menor = valores[i];
			}
			
			media += valores[i];
		}
		
		media /= i;
		
		JOptionPane.showMessageDialog(null, "Maior valor: " + maior
				+ "\nMenor valor: " + menor
				+ "\nMédia dos valores: " + media);
	}
}
