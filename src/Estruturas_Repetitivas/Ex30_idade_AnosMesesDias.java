package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex30_idade_AnosMesesDias {
	public static void main(String[] args) {
		int anoNasc, mesNasc, diaNasc; 
		int anoAtual, mesAtual, diaAtual;
		int bissexto = 0;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
		mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de nascimento: "));
		diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de nascimento: "));
		
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
		mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual: "));
		diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));

		int anoIdade = anoAtual - anoNasc;
		
		for (int i = 0; i <= anoIdade; i++) {
			int anoBissexto = anoNasc + i;
			
			if (anoBissexto % 4 == 0) {
				bissexto += 1;
			}
		}
		
		if (mesAtual < mesNasc) {
			mesAtual += 12;
		}
		int mesIdade = mesAtual - mesNasc;

		if (diaAtual < diaNasc) {
			diaAtual += 30;
		}
		int diaIdade = (diaAtual - diaNasc) + bissexto;
		
		if (diaIdade > 30) {
			diaIdade -= 30;
			mesIdade++;
		}
		
		JOptionPane.showMessageDialog(null, "	IDADE	"
				+ "\nAnos: " + anoIdade
				+ "\nMeses: " + mesIdade
				+ "\nDias: " + diaIdade);
		
	}
}
