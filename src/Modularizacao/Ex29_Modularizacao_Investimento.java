package Modularizacao;

import javax.swing.JOptionPane;

public class Ex29_Modularizacao_Investimento {
	public static void main(String args[]) {
		int tipoInvestimento;
		double valorInvestimento;
		
		tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("            MENU           "
				+ "\n1- Poupança"
				+ "\n2 - Renda Fixa"));
		valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento: "));
		
		investir(tipoInvestimento, valorInvestimento);
	}
	
	public static void investir(int tipoInvestimento, double valorInvestimento) {
		double total = 0;
		
		switch (tipoInvestimento) {
			case 1: 
				total = valorInvestimento * 1.03;
				JOptionPane.showMessageDialog(null, "Valor corrigido: " + total);
			break;
			case 2:
				total = valorInvestimento * 1.05;
				JOptionPane.showMessageDialog(null, "Valor corrigido: " + total);
			break;
			default: 
				JOptionPane.showMessageDialog(null, "Saindo...");
			break;
		}
	}
}
