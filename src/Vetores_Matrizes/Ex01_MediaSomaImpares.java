package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex01_MediaSomaImpares {
	public static void main(String[] args) {
		int[] numeros = new int[50];
		double media = 0;
		int j = 0, impares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero: "));
						
			if (numeros[i] >= 10 && numeros[i] <= 200) {
				media += numeros[i];
				j++;
			}
			
			if (numeros[i] % 2 == 1) {
				impares += numeros[i];
			}
		}
		
		if (j == 0) {
			j++;
		}
		
		media = media / j;
		
		JOptionPane.showMessageDialog(null, "M�dia dos valores entre 10 e 200: " + media 
				+ "\nSomat�ria dos �mpares: " + impares);
	}
}
