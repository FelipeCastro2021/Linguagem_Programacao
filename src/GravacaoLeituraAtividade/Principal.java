package GravacaoLeituraAtividade;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) throws IOException {
		Aluno[] aluno = new Aluno[1];
		Metodos metodo = new Metodos();
		
		int opc = 0;
		
		while (opc != 3) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"	Menu de opções	"
					+ "\n1 - Criar Aluno"
					+ "\n2 - Ler Aluno"
					+ "\n3 - Sair"));
			switch (opc) {
			case 1:
				aluno = metodo.gravarAluno(aluno);
				break;
			case 2:
				metodo.lerAluno(aluno);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Opção selecionada não é válida");
				break;
			}
		}
	}
}
