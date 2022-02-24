package Modularizacao;

import javax.swing.JOptionPane;

public class Ex30_Modularizacao_Idade_AnosMesesDias {
	public static void main(String args[]) {
		int anoNasc, mesNasc, diaNasc; 
		int anoAtual, mesAtual, diaAtual;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
		mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de nascimento: "));
		diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de nascimento: "));
		
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
		mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual: "));
		diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));
		
		calcularIdade(anoNasc, mesNasc, diaNasc, anoAtual, mesAtual, diaAtual);
	}
	
	public static void calcularIdade(int anoNasc, int mesNasc, int diaNasc, 
			int anoAtual, int mesAtual, int diaAtual) {
		int bissexto = 0, anoIdade, mesIdade, diaIdade;
		
		anoIdade = anoAtual - anoNasc;
		
		for (int i = 0; i <= anoIdade; i++) {
			int anoBissexto = anoNasc + i;
			
			if (anoBissexto % 4 == 0) {
				bissexto++;
			}
		}
		
		if (mesAtual < mesNasc) {
			mesAtual += 12;
			anoIdade--;
		}
		
		mesIdade = mesAtual - mesNasc;
		
		if (diaAtual < diaNasc) {
			diaAtual += 30;
			mesIdade--;
		}
		
		diaIdade = (diaAtual - diaNasc) + bissexto;
		
		JOptionPane.showMessageDialog(null, "Anos: " + anoIdade
				+ "\nMês: " + mesIdade
				+ "\nDias: " + diaIdade);
	}
}
