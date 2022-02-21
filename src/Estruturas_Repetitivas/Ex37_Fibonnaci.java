package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex37_Fibonnaci {
	public static void main(String args[]) {
		int numero, n1 = 0, n2 = 1, n3;
				
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira número de contas da série de Fibonacci: "));

		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		
		for (int i = 0; i <= numero; i++) {
			n3 = n2 + n1;
			System.out.print( n3 + " ");
			
			n1 = n2;
			n2 = n3;
		}
	}
}
