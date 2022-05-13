package ClassTransitoAtividade;

import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class ClasseMetodos {
	int i;
	String fileName = "ArquivoTransito.txt";
	
	public Estatistica[] FCadastrarEstatistica(Estatistica[] transito) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ))) {
			for (i = 0; i < transito.length; i++) 
				transito[i] = new Estatistica();
			
			for (int i = 0; i < transito.length; i++) {
				transito[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade: "));
				writer.write(Integer.toString(transito[i].codigoCidade));
				writer.newLine();
				
				transito[i].nomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade: ");
				writer.write(transito[i].nomeCidade);
				writer.newLine();
				
				transito[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes: "));
				writer.write(Integer.toString(transito[i].qtdAcidentes));
				writer.newLine();
				
				transito[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de veículo: "));
				writer.write(Integer.toString(transito[i].tipoVeiculo));
				writer.newLine();
			}
			
			writer.close();
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return transito;
	}
	
	public void FTipo(Estatistica[] transito) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader( fileName ))) {
			boolean statusSelectVeic = false;
				
			int tipoV = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de veículo: "));
				
			for (i = 0; i < transito.length; i++)
				transito[i] = new Estatistica();
			
			for (i = 0; i < transito.length; i++) {
				transito[i].codigoCidade = Integer.parseInt(reader.readLine());
				transito[i].nomeCidade = reader.readLine();
				transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
				transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
			
				statusSelectVeic = true;
			}
			
			if(statusSelectVeic) 
			{
				for (i = 0; i < transito.length; i++)
				{
					if (tipoV == transito[i].tipoVeiculo) {
					System.out.println("Código da cidade: " + transito[i].codigoCidade
							+ "\nNome da cidade: " + transito[i].nomeCidade
							+ "\nQuantidade de acidentes: " + transito[i].qtdAcidentes
							+ "\nTipo de veículo: " + transito[i].tipoVeiculo);
					}
				}
			}
				
			reader.close();
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void PQTAcidentes(Estatistica[] transito) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader( fileName ));
		
		for (i = 0; i < transito.length; i++)
		transito[i] = new Estatistica();
		
		for (i = 0; i < transito.length; i++)
		{
			transito[i].codigoCidade = Integer.parseInt(reader.readLine());
			transito[i].nomeCidade = reader.readLine();
			transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
			transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
		}
		
		for (i = 0; i < transito.length; i++)
		{
			if (transito[i].qtdAcidentes > 100 && transito[i].qtdAcidentes < 500)
				System.out.println("Código da cidade: " + transito[i].codigoCidade
					+ "\nNome da cidade: " + transito[i].nomeCidade
					+ "\nQuantidade de acidentes: " + transito[i].qtdAcidentes
					+ "\nTipo de veículo: " + transito[i].tipoVeiculo);
		}	
	}
	
	public void PConsultaAcidentes(Estatistica[] transito) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader( fileName ));
		
		for (i = 0; i < transito.length; i++)
		transito[i] = new Estatistica();
		
		for (i = 0; i < transito.length; i++)
		{
			transito[i].codigoCidade = Integer.parseInt(reader.readLine());
			transito[i].nomeCidade = reader.readLine();
			transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
			transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
		}
		
		for (int i = 0; i < transito.length; i++) {
			JOptionPane.showMessageDialog(null, 
					"Código da cidade: " + transito[i].codigoCidade +
					"\nNome da cidade: " + transito[i].nomeCidade +
					"\nQuantidade de acidentes: " + transito[i].qtdAcidentes);
		}
	}
	
	public void PMenorAcidentes(Estatistica[] transito) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader( fileName ));
		
		Estatistica[] aux = new Estatistica[1];
		
		for (i = 0; i < transito.length; i++) 
			transito[i] = new Estatistica();
		
		for (i = 0; i < transito.length; i++)
		{
			transito[i].codigoCidade = Integer.parseInt(reader.readLine());
			transito[i].nomeCidade = reader.readLine();
			transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
			transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
		}
		
		int menor = transito[0].qtdAcidentes;
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes < menor) {
				aux[0] = transito[i];
			}
			else 
			{
				aux[0] = transito[0];
			}
		}
		
		
		JOptionPane.showMessageDialog(null, 
				"Código da cidade: " + aux[0].codigoCidade +
				"\nNome da cidade: " + aux[0].nomeCidade +
				"\nQuantidade de acidentes: " + aux[0].qtdAcidentes +
				"\nTipo de veículo: " + aux[0].tipoVeiculo);
	}
	
	public void PMaiorAcidentes(Estatistica[] transito) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader( fileName ));
		
		Estatistica[] aux = new Estatistica[1];
		
		for (i = 0; i < transito.length; i++) 
			transito[i] = new Estatistica();
		
		for (i = 0; i < transito.length; i++)
		{
			transito[i].codigoCidade = Integer.parseInt(reader.readLine());
			transito[i].nomeCidade = reader.readLine();
			transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
			transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
		}
		
		int maior = transito[0].qtdAcidentes;
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes > maior) {
				aux[0] = transito[i];
			}
			else 
			{
				aux[0] = transito[0];
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"Código da cidade: " + aux[0].codigoCidade +
				"\nNome da cidade: " + aux[0].nomeCidade +
				"\nQuantidade de acidentes: " + aux[0].qtdAcidentes +
				"\nTipo de veículo: " + aux[0].tipoVeiculo);
	}
	
	public void PMediaAcidentes(Estatistica[] transito) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader( fileName ));
		
		double media = 0;
		
		for (i = 0; i < transito.length; i++) 
			transito[i] = new Estatistica();
		
		for (i = 0; i < transito.length; i++)
		{
			transito[i].codigoCidade = Integer.parseInt(reader.readLine());
			transito[i].nomeCidade = reader.readLine();
			transito[i].qtdAcidentes = Integer.parseInt(reader.readLine());
			transito[i].tipoVeiculo = Integer.parseInt(reader.readLine());
		}
		
		for (int i = 0; i < transito.length; i++) {
			media += transito[i].qtdAcidentes;
		}
		
		media = media / (transito.length);
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes > media) {
				JOptionPane.showMessageDialog(null, 
						"Código da cidade: " + transito[i].codigoCidade +
						"\nNome da cidade: " + transito[i].nomeCidade +
						"\nQuantidade de acidentes: " + transito[i].qtdAcidentes +
						"\nTipo de veículo: " + transito[i].tipoVeiculo);
			}
		}
	}
}
