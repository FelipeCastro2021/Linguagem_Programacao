package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex39_Modularizacao_QntGraos {
	public static void main(String args[]) {
		double[] casa = new double[65];
		double[] quantidade = new double[65];
		
		qntGraos(casa, quantidade);
	}
	
	public static void qntGraos(double[] casa, double[] quantidade) {
		for (int i = 0; i < casa.length - 1; i++) {
			int j = i + 1;
			
			casa[j] = j;
			quantidade[j] = j;
			
			if (j > 1) {
				quantidade[j] = quantidade[j-1] * 2;				
			}
			
			System.out.print(casa[j] + "");
			System.out.print("/");
			System.out.print(quantidade[j] + " ");
		}
	}
}
