package Estruturas_Condicionais;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex27_VelocMedia {
	public static void main(String args[]) {
		int numVoltas, extensaoCircuito, duracao;
		
		numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
		extensaoCircuito = Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito (m): "));
		duracao = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de duração do circuito (min): "));
		
		extensaoCircuito /= 1000;
		duracao /= 60;
		
		int espaco = numVoltas * extensaoCircuito;
		int velocMedia = espaco / duracao;
		
		JOptionPane.showMessageDialog(null, "Velocidade média: " + velocMedia);
	}
}
