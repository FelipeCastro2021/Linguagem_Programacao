package ProvaSatoshi;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class ProvaSatoshi {
	static int[] vetor = new int[8];

	public static void main(String[] args) {
		int opc;
		double num;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"	Menu de opções" + "\n 1 - Função Série" + "\n 2 - Procedimento Vetor" + "\n 9 - Sair"));

			switch (opc) {
			case 1:
				do {
					num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));

					if (num <= 2 && num > 10) {
						System.out.println("Opção inválida, tente novamente!");
					}

					funcaoSerie(num);
				} while (num > 2 && num <= 10);
				break;
			case 2:
				break;
			case 9:
				System.out.println("Saindo");
				break;
			default:
				System.out.println("A opção selecionada é inválida!");
				break;
			}
		} while (opc != 9);
	}

	public static double funcaoSerie(double num) {
		double resultado;
		
		return resultado;
	}
}
