package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex26_MultiploMenor {
	public static void main (String args[]) {
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1� n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2� n�mero: "));
		
		if (numero1 > numero2) {
			if (numero1 % numero2 == 0) {
				JOptionPane.showMessageDialog(null, numero1 + " � m�ltiplo de " + numero2);
			} else {
				JOptionPane.showMessageDialog(null, numero1 + " n�o � m�ltiplo de " + numero2);
			}
		} else { 
			if (numero2 % numero1 == 0) {
				JOptionPane.showMessageDialog(null, numero2 + " � m�ltiplo de " + numero1);
			} else {
				JOptionPane.showMessageDialog(null, numero2 + " n�o � m�ltiplo de " + numero1);
			}
		}
	}
}
