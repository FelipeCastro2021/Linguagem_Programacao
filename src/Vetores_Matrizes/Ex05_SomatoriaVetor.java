package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex05_SomatoriaVetor {
	public static void main(String[] args) {
		int[] vetores = new int[20];
		int total = 0;
		
		cadastrarValores(vetores);
		
		calcularSomatoria(vetores, total);
	}

	private static void calcularSomatoria(int[] vetores, int total) {
		for (int i = 0; i < (vetores.length / 2); i++) {
			total += (vetores[i] - vetores[(vetores.length - (i + 1))]);
		}
		
		System.out.println("Total: " + total);
	}

	private static int[] cadastrarValores(int[] vetores) {
		for (int i = 0; i < vetores.length; i++) {
			vetores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
		}
		
		return vetores;
	}
}
