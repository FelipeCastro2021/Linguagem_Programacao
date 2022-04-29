package Class;

public class Estatistica {
	int codigoCidade;
	String nomeCidade;
	int qtdAcidentes;
	int tipoVeiculo;
	
	public Estatistica() {
		this(0, "", 0);
	}
	
	public Estatistica(int codigoCidade, String nomeCidade, int qtdAcidentes) {
		this.codigoCidade = codigoCidade;
		this.nomeCidade = nomeCidade;
		this.qtdAcidentes = qtdAcidentes;
	}
}
