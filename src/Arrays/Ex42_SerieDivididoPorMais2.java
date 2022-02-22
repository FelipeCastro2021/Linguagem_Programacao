package Arrays;

import javax.swing.JOptionPane;

public class Ex42_SerieDivididoPorMais2 {
	public static void main(String args[]) {
		int numero = 1;
		double somatoria = 0;
		
		for (int i = 1; i <= 99; i+=2) {
			
			double serie;
			serie = 0;
			
			serie = (double) numero / i;
			somatoria += serie;
			
			System.out.println(numero + " / " + i + " = " + serie);

			numero++;
		}
		
		JOptionPane.showMessageDialog(null, "Somatória da série: " + somatoria);
	}
}
