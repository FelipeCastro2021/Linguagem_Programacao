package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex25_HorarioJogo {
	public static void main(String[] args) {
		int minutoInicio, horaInicio, horaFinal, minutoFinal;
		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o hora inicial do jogo: "));
		minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo: "));
		horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o hora final do jogo: "));
		minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));
		
		if (horaFinal < horaInicio) {
			horaFinal += 24;
		}
		
		if (minutoFinal < minutoInicio) {
			minutoFinal += 60;
			horaFinal -= 1;
		}
		
		int horaJogo = horaInicio - horaFinal;
		int minutoJogo = minutoInicio - minutoFinal;
		
		JOptionPane.showMessageDialog(null, "Tempo de jogo: " + Math.abs(horaJogo) + ":" + Math.abs(minutoJogo));;
	}
}
