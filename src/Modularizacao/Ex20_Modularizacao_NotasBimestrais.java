package Modularizacao;

import javax.swing.JOptionPane;

public class Ex20_Modularizacao_NotasBimestrais {
	public static void main(String args[]) {
		double nota1, nota2, nota3, nota4;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("DIgite a quarta nota: "));
		
		calcularNotaFinal(nota1, nota2, nota3, nota4);
	}
	
	public static void calcularNotaFinal(double n1, double n2, double n3, double n4) {
		double media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "APROVADO, com nota final de: " + media);
		} else if (media >= 3) {
			JOptionPane.showMessageDialog(null, "EXAME, com nota final de: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "RETIDO, com nota final de: " + media);
		}
	}
}
