package Vetores_Matrizes;

import javax.swing.JOptionPane;

public class Ex03_ConcatenacaoVetores {
	public static void main(String[] args) {
		int[] VT1 = new int[3];
		int[] VT2 = new int[3];
		int[] VT3 = new int[6];
		
		for (int i = 0; i < VT1.length; i++) {
			VT1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um dado: "));
		}
		
		for (int i = 0; i < VT2.length; i++) {
			VT2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um dado: "));
		}
		
		for (int i = 0; i < VT3.length; i++) {
			if (i < VT1.length) {
				VT3[i] = VT1[i];
			} else {
				VT3[i] = VT2[i-VT1.length];
			}
			
			JOptionPane.showMessageDialog(null, VT3[i]);
		}
	}
}
