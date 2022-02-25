package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex06_OrdemCrescente {
	public static void main(String[] args) {
		double[] aleatorios = new double[3];
		
		gerarVetor(aleatorios);
		
		for (double d : aleatorios) {
			System.out.println(d);
		}
	}

	public static void gerarVetor(double[] aleatorios) {
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor aleatório: "));
			
			ordenarVetor(aleatorios, i);
		}
	}

	public static void ordenarVetor(double[] aleatorios, int i) {
		double aux;
		
		for (int j = 0; j <= i; j++) {
			if (aleatorios[i] < aleatorios[j]) {
				aux = aleatorios[i];
				aleatorios[i] = aleatorios[j];
				aleatorios[j] = aux;
			}
		}
	}
}
