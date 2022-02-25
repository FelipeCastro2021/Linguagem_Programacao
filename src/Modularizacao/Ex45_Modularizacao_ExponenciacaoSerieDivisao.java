package Modularizacao;

public class Ex45_Modularizacao_ExponenciacaoSerieDivisao {
	public static void main(String args[]) {
		int j = 1, i = 1;
		double total = 0;
		
		modularizarSequencia(total);
	}

	private static void modularizarSequencia(double total) {
		int j;
		int i;
		for (i = 1; i <= 15; i++) {
			for (j = i; j <= i; j++) {
				double exponencial;
				exponencial = Math.pow(j, 2);
				
				if (i % 2 == 0) {
					total = (double) total -  (i / exponencial);
				} else {
					total = (double) total +  (i / exponencial);
				}
				
				System.out.println("Total: " + total);
			}
		}
	}
}
