package GravacaoLeitura;

public class Aluno {
	public String pnome;	 
	public String unome;	 
	public int pontos;	 
		 
	// construtor	 
	public Aluno () {	 
		this("" ,"" ,0);	 
	}	 
		 
	Aluno (String pnome, String unome, int pontos) {	 
	  this.pnome   = pnome;	 
	  this.unome  = unome;	 
	  this.pontos  = pontos;	 
	 }	 
}
