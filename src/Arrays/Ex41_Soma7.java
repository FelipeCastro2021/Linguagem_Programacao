package Arrays;

public class Ex41_Soma7 {
	public static void main(String args[]) {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				int soma = 0;
				soma = i + j;
				
				if (soma == 7) {
					System.out.println(i + " + " + j + " = 7");				
				}
			}
		}
	}
}
