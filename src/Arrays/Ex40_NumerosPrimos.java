package Arrays;

import javax.swing.JOptionPane;

public class Ex40_NumerosPrimos {
	public static void main(String args[]) {
		int num1, num2, qtdDivid = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número: "));
		
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}

		if (qtdDivid > 2) {
			System.out.println(" | " + num1 + " não é número primo");
		} else {
			System.out.println(" | " + num1 + " é um número primo!");
		}
		
		qtdDivid = 0;
		
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
