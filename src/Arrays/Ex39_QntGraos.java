package Arrays;

import javax.swing.JOptionPane;

public class Ex39_QntGraos {
	public static void main(String args[]) {
		double[] casa = new double[64];
		double[] quantidade = new double[64];
		
		for (int i = 1; i < casa.length; i++) {
			casa[i] = i;
			quantidade[i] = i;
			
			if (i > 1) {
				quantidade[i] = quantidade[i-1] * 2;				
			}
			
			System.out.print(casa[i] + "");
			System.out.print("/");
			System.out.print(quantidade[i] + " ");
		}
	}
}
