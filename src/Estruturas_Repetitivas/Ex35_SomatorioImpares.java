package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex35_SomatorioImpares {
	public static void main(String[] args) {
		int num1, num2, somatoria = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� n�mero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2� n�mero: "));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " � maior que: " + num2);
		} else {
			JOptionPane.showMessageDialog(null, num2 + " � maior que: " + num1);
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
		
		JOptionPane.showMessageDialog(null, "Somat�ria dos valores: " + somatoria);
		
		
	}
}
