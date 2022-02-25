package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex40_Modularizacao_NumerosPrimos {
	public static void main(String args[]) {
		int num1, num2, qtdDivid = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número: "));
		
		cadastrarNumeros(num1, qtdDivid);
		
		obterQuantidade(num1, num2);
	}

	private static void cadastrarNumeros(int num1, int qtdDivid) {
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}
	}

	private static void obterQuantidade(int num1, int num2) {
		int qtdDivid;
		qtdDivid = 0;

		if (qtdDivid > 2) {
			System.out.println(" | " + num1 + " não é número primo");
		} else {
			System.out.println(" | " + num1 + " é um número primo!");
		}
		
		for (int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}
		
		if (qtdDivid > 2) {
			System.out.println(" | " + num2 + " não é um número primo!");
		} else {
			System.out.println(" | " + num2 + " é um número primo!");
		}
	}
}
