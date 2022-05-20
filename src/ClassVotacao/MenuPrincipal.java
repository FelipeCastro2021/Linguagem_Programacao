package ClassVotacao;

/*
 * @Author: Felipe Castro Ferreira
 * */

import javax.swing.JOptionPane;
import java.io.*;

public class MenuPrincipal {
	public static void main(String[] args) throws IOException {
		Votacao[] votos = new Votacao[100];
		Metodos metodo = new Metodos();
		
		int opc = 0;
		
		do 
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"	SISTEMA DE VOTAÇÃO	"
					+ "\n1 - Carregar seção / número de eleitor"
					+ "\n2 - Classificar por seção"
					+ "\n3 - Gravar registros"
					+ "\n4 - Mostrar indicadores"
					+ "\n9 - Finalizar"));
	
			switch (opc) 
			{
			case 1:
				votos = metodo.FCadastrarVotacao(votos);
				break;
			case 2:
				metodo.Fclassificacao(votos);
				break;
			case 3:
				metodo.FGravaVotacao(votos);
				break;
			case 4:
				int indicadores = 0;
				
				do 
				{
					indicadores = Integer.parseInt(JOptionPane.showInputDialog(
							"	Mostrar Indicadores	"
							+ "\n	Estatísticas de Votação em 2016"
							+ "\n1 - Quantidade de Eleitores por Seção"
							+ "\n2 - Seção com Maior e Menor número de Eleitores"
							+ "\n3 - Quantidade de votos por candidato"
							+ "\n4 - 10 primeiros colocadas (Número de candidatos e Quantidade de votos)"
							+ "\n9 - Finalizar consulta"));
					
					switch (indicadores) 
					{
					case 1:
						metodo.FEleitoresSecao(votos);
						break;
					case 2:
						metodo.maiorMenorSecao();
						break;
					case 3:
						metodo.quantVotosCandidato(votos);
						break;
					case 4:
						break;
					case 9:
						JOptionPane.showMessageDialog(null, "Saindo...");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção digitada é inválida!");
						break;
					}
				} while (indicadores != 9);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção selecionada é inválida!");
				break;		
			}
		} while (opc != 9);
	}
}
