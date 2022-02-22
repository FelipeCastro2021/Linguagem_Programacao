package Arrays;

import javax.swing.JOptionPane;

public class Ex43_IdadeMaiorOutra {
	public static void main(String args[]) {
		double ana = 1.1, maria = 1.5, crescAna = 0.03, crescMaria = 0.02;
		int anos = 0;
		
		do {
			ana += crescAna;
			maria += crescMaria;
		
			anos++;
		} while (ana <= maria);
		
		JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para Ana ficar maior que Maria");
	}
}
