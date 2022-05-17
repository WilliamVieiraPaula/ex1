package model;

public class JogosEletronicos {
	
	String nome; 
	
	double valor;
	
	public enum Tipojogo{
		XBOX, PLAYSTATION, SWITCH
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
