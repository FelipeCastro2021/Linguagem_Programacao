package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex35_SomatorioImpares {
	public static void main(String[] args) {
		int num1, num2, somatoria = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número: "));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " é maior que: " + num2);
		} else {
			JOptionPane.showMessageDialog(null, num2 + " é maior que: " + num1);
		}
		
		for (int i = 0; i <= num1; i++) {
			if (i % 2 == 1) {
				somatoria += i;
			}
		}
		
		for (int i = 0; i <= num2; i++) {
			if (i % 2 == 1) {
				somatoria += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Somatória dos valores: " + somatoria);
		
		
	}
}
