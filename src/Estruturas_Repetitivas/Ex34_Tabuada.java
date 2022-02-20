package Estruturas_Repetitivas;

import javax.swing.JOptionPane;

public class Ex34_Tabuada {
	public static void main(String args[]) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		
		for (int i = 0; i <= 10; i++) {
			JOptionPane.showMessageDialog(null, num + " * " + i + " = " + (num*i));
		}
	}
}
