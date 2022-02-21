package Arrays;

import javax.swing.JOptionPane;

public class Ex38_MaiorMenor {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		int maior = 0, menor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
			maior = numeros[0];
			menor = numeros[0];
			
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior número: " + maior 
				+"\nMenor número: " + menor);
	}
}
