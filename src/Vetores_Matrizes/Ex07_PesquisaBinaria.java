package Vetores_Matrizes;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex07_PesquisaBinaria {
	public static void main(String[] args) {
		Ex06_OrdemCrescente lister = new Ex06_OrdemCrescente();
		double[] aleatorios = new double[3];
		double valorAleatorio = 0;
		int tamanho = 0;
		
		System.out.println(tamanho);
		
		lister.gerarVetor(aleatorios);
		
		valorAleatorio = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor aleatório: "));
	
		do {
			
		} while ((aleatorios.length / 2) + 1 == 1);
	}
}
