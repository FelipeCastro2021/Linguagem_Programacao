package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex28_Modularizacao_NovoProduto {
	public static void main(String[] args) {
		double precoAtual, mediaMensal;
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto: "));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a média mensal do produto: "));
		
		condicionarTaxa(precoAtual, mediaMensal);
	}
	
	public static void condicionarTaxa(double precoAtual, double mediaMensal) {
		if (mediaMensal < 500 && precoAtual < 30) {
			precoAtual *= 1.10;
		} else if (mediaMensal >= 500 && precoAtual < 80) {
			precoAtual *= 1.15;
		} else if (mediaMensal >= 1000 && precoAtual >= 80) {
			precoAtual *= 0.95;
		} else {
			precoAtual = precoAtual;
		}
		
		JOptionPane.showMessageDialog(null, "Novo preço do produto: " + precoAtual)	;
	}
}
