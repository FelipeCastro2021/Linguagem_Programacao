package Modularizacao;

import javax.swing.JOptionPane;;

public class Ex20_Modularizacao_Equacao2Grau {
	public static void main(String args[]) {
		int a = 0, b = 0, c = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira o coeficiente A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira o coeficiente B: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira o coeficiente C: "));
		
		double delta = calcularDelta(a, b, c);
		
		if (delta < 0) {
			JOptionPane.showMessageDialog(null, "Não existem raízes reais");
		} else {
			calcularRaizes(a, b, delta);
		}
	}
	
	public static double calcularDelta(int a, int b, int c) {
		double delta = 0;
		
		delta = (double) (b * b) - (4 * a * c);
				
		System.out.println(delta);
		
		return delta;
	}
	
	public static void calcularRaizes(int a, int b, double delta) {
		double x1 = 0, x2 = 0;
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / 2 * a;
		
		JOptionPane.showMessageDialog(null, "X1: " + x1 
				+ "\nX2: " + x2);
	}
}
