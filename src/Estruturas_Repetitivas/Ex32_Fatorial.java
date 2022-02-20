package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex32_Fatorial {
	public static void main(String[] args) {
		int valor, fatorial = 1;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		
		JOptionPane.showMessageDialog(null, "Fatorial de " + valor + ": " + fatorial);
	}
}
