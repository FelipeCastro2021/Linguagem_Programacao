package Modularizacao;

import javax.swing.JOptionPane;

public class Ex17_Modularizacao_GastoCombustivel_Viagem {
	public static void main(String[] args) {
		int tempo, velocMedia;
		
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo do percurso: (H) "));
		velocMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade média: (Km/H) "));
		
		consumirCombustivel(tempo, velocMedia);
	}
	
	public static void consumirCombustivel(int tempo, int velocMedia) {
		int espaco = tempo * velocMedia;
		int gasto = espaco / 12;
		
		JOptionPane.showMessageDialog(null, "Gasto com combustível na viagem: " + gasto + " litros");
		
	}
}
