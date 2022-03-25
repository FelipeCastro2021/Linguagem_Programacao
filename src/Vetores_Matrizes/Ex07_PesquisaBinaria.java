package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex07_PesquisaBinaria {
	public static void main(String[] args) {
		double[] aleatorios = {7, 14, 30, 31, 70, 50, 100, 110, 150, 180, 200, 215, 230};
		double valorAleatorio = 0;
		
		// gerarVetor(aleatorios);
		
		/* for (double d : aleatorios) {
			System.out.println(d);
		} */
		
		valorAleatorio = Double.parseDouble(JOptionPane.showInputDialog("Pesquise um número no vetor: "));
		
		pesquisaBinaria(valorAleatorio, aleatorios);
	}

	public static void gerarVetor(double[] aleatorios) {
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor aleatório: "));			
		}
		
		ordenarVetor(aleatorios);
	}

	public static void ordenarVetor(double[] aleatorios) {
		double aux;
		
		for (int i = 0; i < (aleatorios.length - 1); i++) {
			for (int j = (i + 1); j < aleatorios.length; j++) { 
				if (aleatorios[i] > aleatorios[j]) {
					aux = aleatorios[j];
					aleatorios[j] = aleatorios[i];
					aleatorios[i] = aux;
				}
			}
		}
	}
	
	static double pesquisaBinaria(double valorAleatorio, double[] aleatorios) {				
		int inicio = 0, meio = 0, fim = aleatorios.length - 1;
		
		while (inicio <= fim) {
			meio = (fim + inicio) / 2;
			
			if (aleatorios[meio] == valorAleatorio) {
				System.out.println("Valor encontrado: " + aleatorios[meio]);
				break;
			}
			
			if (aleatorios[meio] < valorAleatorio) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
			
			if (inicio > fim) {
				System.out.println("Número " + valorAleatorio + " não foi encontrado");
			}
		}

		
		return valorAleatorio;
	}
}
