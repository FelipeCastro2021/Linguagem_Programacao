package Modularizacao;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex27_Modularizacao_VelocMedia {
	public static void main(String args[]) {
		int numVoltas, extensaoCircuito, duracao;
		
		numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero de voltas: "));
		extensaoCircuito = Integer.parseInt(JOptionPane.showInputDialog("Insira a extens�o do circuito (m): "));
		duracao = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de dura��o do circuito (min): "));
	
		calcularVelocMedia(numVoltas, extensaoCircuito, duracao);
	}
	
	public static void calcularVelocMedia(int numVoltas, int extensaoCircuito, int duracao) {
		extensaoCircuito /= 1000;
		duracao /= 60;
		
		int espaco = numVoltas * extensaoCircuito;
		int velocMedia = espaco / duracao;
		
		JOptionPane.showMessageDialog(null, "Velocidade m�dia: " + velocMedia);
	}
}
