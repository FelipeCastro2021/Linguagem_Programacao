package Class;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class ClasseMetodos {
	public Estatistica[] FCadastrarEstatistica(Estatistica[] transito) {
		for (int i = 0; i < transito.length; i++) {
			transito[i] = new Estatistica();
			transito[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo da cidade: "));
			transito[i].nomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade: ");
			transito[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes: "));
			transito[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de ve�culo: "));
		}
		
		return transito;
	}
	
	public void FTipo(Estatistica[] transito) {
		int tipoV = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de ve�culo: "));
		
		for (int i = 0; i < transito.length; i++) {
			if (tipoV == transito[i].tipoVeiculo) {
				JOptionPane.showMessageDialog(null, 
						"C�digo da cidade: " + transito[i].codigoCidade +
						"\nNome da cidade: " + transito[i].nomeCidade +
						"\nQuantidade de acidentes: " + transito[i].qtdAcidentes +
						"\nTipo de ve�culo: " + transito[i].tipoVeiculo);
			}
		}
	}
	
	public void PQTAcidentes(int i, Estatistica[] transito) {
		JOptionPane.showMessageDialog(null, 
				"C�digo da cidade: " + transito[i].codigoCidade +
				"\nNome da cidade: " + transito[i].nomeCidade + 
				"\nQuantidade de acidentes: " + transito[i].qtdAcidentes +
				"\nTipo de ve�culo: " + transito[i].tipoVeiculo);
	}
	
	public void PConsultaAcidentes(Estatistica[] transito) {
		for (int i = 0; i < transito.length; i++) {
			JOptionPane.showMessageDialog(null, 
					"C�digo da cidade: " + transito[i].codigoCidade +
					"\nNome da cidade: " + transito[i].nomeCidade +
					"\nQuantidade de acidentes: " + transito[i].qtdAcidentes);
		}
	}
	
	public void PMenorAcidentes(Estatistica[] transito) {
		int menor = transito[0].qtdAcidentes;
		int menorIndex = 0;
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes < menor) {
				menorIndex = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"C�digo da cidade: " + transito[menorIndex].codigoCidade +
				"\nNome da cidade: " + transito[menorIndex].nomeCidade +
				"\nQuantidade de acidentes: " + transito[menorIndex].qtdAcidentes +
				"\nTipo de ve�culo: " + transito[menorIndex].tipoVeiculo);
	}
	
	public void PMaiorAcidentes(Estatistica[] transito) {
		int maior = transito[0].qtdAcidentes;
		int maiorIndex = 0;
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes > maior) {
				maiorIndex = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				"C�digo da cidade: " + transito[maiorIndex].codigoCidade +
				"\nNome da cidade: " + transito[maiorIndex].nomeCidade +
				"\nQuantidade de acidentes: " + transito[maiorIndex].qtdAcidentes +
				"\nTipo de ve�culo: " + transito[maiorIndex].tipoVeiculo);
	}
	
	public void PMediaAcidentes(Estatistica[] transito) {
		double media = 0;
		
		for (int i = 0; i < transito.length; i++) {
			media += transito[i].qtdAcidentes;
		}
		
		media = media / (transito.length - 1);
		
		for (int i = 0; i < transito.length; i++) {
			if (transito[i].qtdAcidentes > media) {
				JOptionPane.showMessageDialog(null, 
						"C�digo da cidade: " + transito[i].codigoCidade +
						"\nNome da cidade: " + transito[i].nomeCidade +
						"\nQuantidade de acidentes: " + transito[i].qtdAcidentes +
						"\nTipo de ve�culo: " + transito[i].tipoVeiculo);
			}
		}
	}
}
