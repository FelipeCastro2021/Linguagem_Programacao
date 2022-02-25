package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex04_vetorReal {
	public static void main(String[] args) {
		double[] vetor = new double[30];
		int qtdMaior = 0, qtdMenor = 0;
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));
			
			media += vetor[i];
		}
		
		media /= (vetor.length);
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				qtdMaior++;
			} else {
				qtdMenor++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "M�dia do grupo: " + media
				+ "\nQuantidade de notas maior que a m�dia do grupo: " + qtdMaior
				+ "\nQuantidade de notas menor que a m�dia do grupo: " + qtdMenor);
	}
}
