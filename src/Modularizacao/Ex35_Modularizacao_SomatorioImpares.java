package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex35_Modularizacao_SomatorioImpares {
	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
		
		JOptionPane.showMessageDialog(null, "Somatório dos números ímpares: " + somatorioImpares(num1, num2));
	}
	
	public static int somatorioImpares(int num1, int num2) {
		int somatorio = 0, menor = 0, maior = 0;
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		for (int i = 0; i <= maior; i++) {
			if (i % 2 == 1) {
				if (menor >= i) {
					somatorio += i;
				}
				
				somatorio += i;
			}
		}
		
		return somatorio;
	}
}
