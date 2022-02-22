package Arrays;

import javax.swing.JOptionPane;

public class Ex40_NumerosPrimos {
	public static void main(String args[]) {
		int num1, num2, qtdDivid = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2� n�mero: "));
		
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}

		if (qtdDivid > 2) {
			System.out.println(" | " + num1 + " n�o � n�mero primo");
		} else {
			System.out.println(" | " + num1 + " � um n�mero primo!");
		}
		
		qtdDivid = 0;
		
		for (int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
				System.out.print(i + " ");
				qtdDivid += 1;
			}
		}
		
		if (qtdDivid > 2) {
			System.out.println(" | " + num2 + " n�o � um n�mero primo!");
		} else {
			System.out.println(" | " + num2 + " � um n�mero primo!");
		}
	}
}
