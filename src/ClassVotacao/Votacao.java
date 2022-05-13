package ClassVotacao;

public class Votacao {
	public int numerioSecao;
	public int numeroCandidato;
	
	public Votacao()
	{
		this(0, 0);
	}
	
	public Votacao(int numerioSecao, int numeroCandidato)
	{
		this.numerioSecao = numerioSecao;
		this.numeroCandidato = numeroCandidato;
	}
}
