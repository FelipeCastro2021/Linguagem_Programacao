package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex23_3Sequencia_4Aleatorio {
	public static void main(String[] args) {
		int sequencia1 = 0, sequencia2 = 2, sequencia3 = 4;
		int valor4;
		
		valor4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 4º valor: "));
		
		if (valor4 < sequencia1) {
			JOptionPane.showMessageDialog(null, valor4 + " " + sequencia1 + " " + sequencia2 + " " + sequencia3);
		} else if (valor4 < sequencia2){
			JOptionPane.showMessageDialog(null, sequencia1 + " " + valor4 + " " + sequencia2 + " " + sequencia3);
		} else if (valor4 < sequencia3) {
			JOptionPane.showMessageDialog(null, sequencia1 + " " + sequencia2 + " " + valor4 + " " + sequencia3);
		} else {
			JOptionPane.showMessageDialog(null, sequencia1 + " " + sequencia2 + " " + sequencia3 + " " + valor4);
		}
	}
}
