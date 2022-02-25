package Vetores_Matrizes;

import javax.swing.JOptionPane;

public class Ex08_MatrizProdutos {
	public static void main(String[] args) {
		int[][] produtos = new int[4][3];
		
		for (int i = 0; i < produtos.length; i++) {
			
			for (int j = 0; j < produtos[i].length; j++) {
				produtos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
				System.out.print(produtos[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
