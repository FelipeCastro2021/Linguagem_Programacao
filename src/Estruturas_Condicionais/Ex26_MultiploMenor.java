package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex26_MultiploMenor {
	public static void main (String args[]) {
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número: "));
		
		if (numero1 > numero2) {
			if (numero1 % numero2 == 0) {
				JOptionPane.showMessageDialog(null, numero1 + " é múltiplo de " + numero2);
			} else {
				JOptionPane.showMessageDialog(null, numero1 + " não é múltiplo de " + numero2);
			}
		} else { 
			if (numero2 % numero1 == 0) {
				JOptionPane.showMessageDialog(null, numero2 + " é múltiplo de " + numero1);
			} else {
				JOptionPane.showMessageDialog(null, numero2 + " não é múltiplo de " + numero1);
			}
		}
	}
}
