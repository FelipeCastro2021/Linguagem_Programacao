package GravacaoLeituraAtividade;

import java.io.*;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Metodos {
	int i;
	String fileName = "ArquivoAluno.txt";
	
	public Aluno[] gravarAluno(Aluno[] aluno) throws IOException {
		//GravaAluno.main(null);

		BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	

		for (i = 0 ; i < aluno.length; i++) 
			aluno[i] = new Aluno();

		for (i = 0 ; i < aluno.length ; i++) {	
			aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
			writer.write( aluno[i].pnome );  	
			writer.newLine();	
			
			aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
			writer.write( aluno[i].unome );  	
			writer.newLine();	

			aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));	
			writer.write(Integer.toString(aluno[i].pontos));  
			writer.newLine();	
		}	
	
		for (i = 0 ; i < aluno.length; i++) {	
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
		}
		
		writer.close();
		return aluno;
	}
	
	public void lerAluno(Aluno[] aluno) throws IOException {
		//LerAluno.main(null);

		BufferedReader ler = new BufferedReader(new FileReader( fileName ));	

		for (i = 0 ; i < aluno.length ; i++)	
			aluno[i] = new Aluno();

		for (i = 0 ; i < aluno.length ; i++) {	
			aluno[i].pnome = ler.readLine();  	
			aluno[i].unome = ler.readLine();	
			aluno[i].pontos = Integer.parseInt(ler.readLine());	
		}	
	
		for (i = 0 ; i < aluno.length; i++) {	
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
		}
		
		ler.close();	
	}
}
