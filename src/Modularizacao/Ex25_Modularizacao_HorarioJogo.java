package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex25_Modularizacao_HorarioJogo {
	public static void main(String args[]) {
		int horaInicio, minutoInicio, horaFinal, minutoFinal;
		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de início do jogo: "));
		minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de início do jogo: "));
		horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final de jogo: "));
		minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto final do jogo: "));
		
		calcularTempoJogo(horaInicio, minutoInicio, horaFinal, minutoFinal);
	}
	
	public static void calcularTempoJogo(int hI, int mI, int hF, int mF) {
		int horaJogo = 0, minutoJogo = 0;
		
		if (hF < hI) {
			hF += 24;
		}
		
		if (mF < mI) {
			mF += 60;
			hF--;
		}
		
		horaJogo = hF - hI;
		minutoJogo = mF - mI;
		
		JOptionPane.showMessageDialog(null,"Horário de início: " + hI + ":" + mI
				+ "\nHorário de finalização: " + hF + ":" + mF
				+ "\nTempo de jogo: " + horaJogo + ":" + minutoJogo);
	}
}
