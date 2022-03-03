package PraticaReal;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Ex01_CaixaEletronica {
	public static void main(String[] args) {
		int caixa = 0;
		int[] notas = new int[6];
		
		do {
			caixa = Integer.parseInt(JOptionPane.showInputDialog("		CAIXA ELETRÔNICO		"
					+ "\n 1 - Carregar Notas"
					+ "\n 2 - Retirar Notas"
					+ "\n 3 - Estatística"
					+ "\n 9 - Fim"));
			
			switch (caixa) {
			case 1:
				carregarNotas(notas);
				
				for (int i = 0; i < notas.length; i++) {
					System.out.println(notas[i]);
				}
				break;
			case 2:
				retirarNotas(notas);
				
				
				break;
			case 3:
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Digite um valor válido");
			}
		} while(caixa != 9);
				
	}
	
	public static int[] carregarNotas(int[] notas) {
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira sua nota: "));
		}
		return notas;
	}
	
	public static void retirarNotas(int[] notas) {
		int aux = 0;
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = (i + 1); j < notas.length; j++) {
				if (notas[i] < notas[j]) {
					aux = notas[i];
					notas[i] = notas[j];
					notas[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
	}
}
