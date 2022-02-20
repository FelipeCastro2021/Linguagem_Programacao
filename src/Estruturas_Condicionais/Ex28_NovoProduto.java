package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex28_NovoProduto {
	public static void main(String[] args) {
		double precoAtual, mediaMensal;
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o atual do produto: "));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a m�dia mensal do produto: "));
		
		if (mediaMensal < 500 && precoAtual < 30) {
			precoAtual *= 1.10;
		} else if (mediaMensal >= 500 && precoAtual < 80) {
			precoAtual *= 1.15;
		} else if (mediaMensal >= 1000 && precoAtual >= 80) {
			precoAtual *= 0.95;
		} else {
			precoAtual = precoAtual;
		}
		
		JOptionPane.showMessageDialog(null, "Novo pre�o do produto: " + precoAtual)	;
	}
}
