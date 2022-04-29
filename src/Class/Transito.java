package Class;

import javax.swing.JOptionPane;

/*
 * @Author: Felipe Castro Ferreira
 * */

public class Transito {
	public static void main(String[] args) {
		Estatistica[] transito = new Estatistica[3];
		ClasseMetodos metodo = new ClasseMetodos();
		
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("	Menu de op��es	"
					+ "\n1 - Cadastrar Estat�stica"
					+ "\n2 - Consultar tipo do ve�culo"
					+ "\n3 - Consultar por quantidade de acidentes 101-499"
					+ "\n4 - Consulta por quantidade de acidentes"
					+ "\n5 - Consultar menor n�mero de acidentes"
					+ "\n6 - Consultar maior n�mero de acidentes"
					+ "\n7 - Consultar cidades acima da m�dia de acidentes"
					+ "\n9 - Sair"));
			
			switch (opc) {
			case 1:
				transito = metodo.FCadastrarEstatistica(transito);
				break;
			case 2:
				metodo.FTipo(transito);
				break;
			case 3:
				for (int i = 0; i < transito.length; i++) {
					if (transito[i].qtdAcidentes > 100 && transito[i].qtdAcidentes < 500) {
						metodo.PQTAcidentes(i, transito);
					}
				}
				
				break;
			case 4:
				metodo.PConsultaAcidentes(transito);
				break;
			case 5:
				metodo.PMenorAcidentes(transito);
				break;
			case 6:
				metodo.PMaiorAcidentes(transito);
				break;
			case 7:
				metodo.PMediaAcidentes(transito);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Selecionou op��o inv�lida!");
				break;
			}
		} while (opc != 9);
	}
}
