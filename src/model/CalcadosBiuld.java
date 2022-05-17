package model;



public class CalcadosBiuld {
	private Calcados calcados;
	
	public CalcadosBiuld() {
		this.calcados= new Calcados();
	}
	
	public static CalcadosBiuld builder() {
		return new CalcadosBiuld();
	}


	public CalcadosBiuld AddTamanho(int tamanho) {
		if (tamanho>=35 && tamanho <=44){
		this.calcados.setTamanho(tamanho);}
		else{
			System.out.println("esse tamanho não tem no estoque");}
		return this;
	}
	public CalcadosBiuld addCor(String cor) {
		this.calcados.setCor(cor);
		return this;
	}
	public CalcadosBiuld addTipo(String tipo) {
		Calcados cal = new Calcados();
		this.calcados.setTipo(tipo);
		return this;
	}
	
		
	public Calcados addValor(double valor) {
		Calcados cal = new Calcados();
		this.calcados.setValor(valor);
		return cal;
	}
}

