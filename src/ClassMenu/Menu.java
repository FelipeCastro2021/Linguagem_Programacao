package ClassMenu;

import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		Aluno[ ] aluno = new Aluno[3]; 
		ClasseMetodos m = new ClasseMetodos();
		
		int i;
		
		for (i = 0 ; i < 3 ; i++){
			aluno[i] = new Aluno(); 
		}
		
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog
		              ("1 -  Cadastra Alunos \n 2 - Consulta Registros \n 9 - Finaliza"));
		     switch (opc) {
		            case 1:  aluno = m.FCadastra(aluno); // CHAMADA FUNÇÃO
		                     break;
		            case 2: m.FConsulta(aluno); // CHAMADA PROCEDIMENTO
		                    break;
		            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
		                     break;
		            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
		         } 

		}
	}
}
