package ClassVotacao;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.util.Random;

public class Metodos {
	int i;
	String fileName = "Arquivovotos.txt";
	int[] eleitoresSecao = new int[10];
	int[] votosCandidatos = new int[300];
	
	public Votacao[] FCadastrarVotacao(Votacao[] votos) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			Random voto = new Random();
			
			for (i = 0; i < votos.length; i++)
				votos[i] = new Votacao();

			for (int i = 0; i < votos.length; i++) {
				boolean isOk = true;

				do {
					votos[i].numeroCandidato = voto.nextInt(300);
					votos[i].numerioSecao = voto.nextInt(10) + 1;
					
					if (votos[i].numeroCandidato < 0 || votos[i].numeroCandidato > 300 || votos[i].numerioSecao < 0
							|| votos[i].numerioSecao > 10) {
						isOk = false;
					}
				} while (isOk != true);
			}

			writer.close();
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return votos;
	}

	public Votacao[] Fclassificacao(Votacao[] votos) throws IOException {
		for (i = 0; i < (votos.length - 1); i++) {
			for (int j = i + 1; j < votos.length; j++) {
				if (votos[i].numerioSecao > votos[j].numerioSecao) {
					int aux = i;

					votos[i].numerioSecao = votos[aux].numerioSecao;
					votos[i].numerioSecao = votos[j].numerioSecao;
					votos[j].numerioSecao = votos[aux].numerioSecao;
				}
			}
		}

		for (i = 0; i < votos.length; i++) {
			System.out.println("Dados classificados: " + votos[i].numerioSecao);
		}

		JOptionPane.showMessageDialog(null, "Dados classificados!");

		return votos;
	}
	
	public Votacao[] FGravaVotacao(Votacao[] votos) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ))) {
			for (int i = 0; i < votos.length; i++) {
				writer.write(Integer.toString(votos[i].numeroCandidato));
				writer.newLine();
				
				writer.write(Integer.toString(votos[i].numerioSecao));
				writer.newLine();
			}
			
			writer.close();
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return votos;
	}
	
	public void FEleitoresSecao(Votacao[] voto) throws IOException
	{
		try (BufferedReader reader = new BufferedReader(new FileReader( fileName ))) {
			for (i = 0; i < voto.length; i++)
			{
				voto[i] = new Votacao();
			}
			
			for (i = 0; i < eleitoresSecao.length; i++)
				eleitoresSecao[i] = 0;
				
			for (i = 0; i < voto.length; i++) {
				voto[i].numeroCandidato = Integer.parseInt(reader.readLine());
				voto[i].numerioSecao = Integer.parseInt(reader.readLine());
				
				eleitoresSecao[voto[i].numerioSecao]++; 
			}
			
			
			for (i = 0; i < eleitoresSecao.length; i++)		
				System.out.println("Quantidade de eleitores da seção " + i + "º: " + eleitoresSecao[i]);
			
			reader.close();
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void maiorMenorSecao()
	{
		int maior = eleitoresSecao[0], menor = eleitoresSecao[0];
		
		for (i = 0; i < eleitoresSecao.length; i++) 
		{
			if (maior < eleitoresSecao[i])
				maior = eleitoresSecao[i];
			if (menor > eleitoresSecao[i])
				menor = eleitoresSecao[i];
		}
		
		JOptionPane.showMessageDialog(null, "Maior: " + maior +
				"\nMenor: " + menor);
	}
	
	public void quantVotosCandidato(Votacao[] voto) throws IOException
	{
		try (BufferedReader reader = new BufferedReader(new FileReader( fileName ))) {
			for (i = 0; i < voto.length; i++)
			{
				voto[i] = new Votacao();
			}
				
			for (i = 0; i < voto.length; i++) {
				voto[i].numeroCandidato = Integer.parseInt(reader.readLine());
				voto[i].numerioSecao = Integer.parseInt(reader.readLine());
			}
			
			for (i = 0; i < voto.length; i++)
			{
				votosCandidatos[i] = 0;
				votosCandidatos[voto[i].numeroCandidato]++;
			}
			
			for (i = 0; i < votosCandidatos.length; i++)		
				System.out.println("Quantidade de votos por candidatos " + i + "º: " + votosCandidatos[i]);
			
			reader.close();
		}  catch (NumberFormatException | HeadlessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public void maisVotados() throws IOException
	{
		try 
		{
		int[] maisVotados = new int[10];
		
		for (i = 0; i < votosCandidatos.length; i++)
			votosCandidatos[i] = 0;
		
		for (i = 0; i < votosCandidatos.length; i++) 
		{
			
				if (votosCandidatos[i] > maisVotados[0])
				{
					for (int j = 1; j < maisVotados.length; j++)
					{
						maisVotados[j] = maisVotados[j - 1];
					}
					maisVotados[0] = votosCandidatos[i];
				}
			}
		
		for (i = 0; i < maisVotados.length; i++)		
			System.out.println("Mais votado " + i + "º: " + votosCandidatos[i]);
		
		} catch (NumberFormatException | HeadlessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
