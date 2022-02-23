package Modularizacao;

import javax.swing.JOptionPane;

public class Ex19_Modularizacao_MaiorReal {
	public static void main(String args[]) {
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
		
		JOptionPane.showMessageDialog(null, "O maior valor real é: " 
		+ calcularMaiorReal(valor1, valor2));
	}
	
	public static double calcularMaiorReal(double v1, double v2) {
		double maior = 0;
		
		if (v1 > v2) {
			maior = v1;
		} else {
			maior = v2;
		}
		
		return maior;
	}
}
