package Modularizacao;

import javax.swing.JOptionPane;

public class Ex16_Modularizacao_SalarioTrabalhado {
	public static void main(String args[]) {
		int quantHoras, dependentes;
		double valorHora, desconto;
		
		quantHoras = Integer.parseInt(JOptionPane.showInputDialog("Insira as horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o desconto: "));
		dependentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dependentes: "));
	
		calcularSalario(quantHoras, valorHora, desconto, dependentes);
	}
	
	public static void calcularSalario(int quantHoras, double valorHora, double desconto, int dependentes) {
		desconto /= 100 + 1;
		dependentes *= 100;
		double total = (double) ((quantHoras * valorHora) * desconto) + (dependentes);
		JOptionPane.showMessageDialog(null, "Novo salário: " + total);
	}
}
