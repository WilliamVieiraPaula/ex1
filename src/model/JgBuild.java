package model;

public class JgBuild {
	

	private JogosEletronicos jg;
	private Object JogosEletronicos;


	public JgBuild() {
		this.jg= new JogosEletronicos();
	}
	
	public static JgBuild builder() {
		return new JgBuild();
	}

	
	public JgBuild AddTipoJogo(JogosEletronicos jg) {
		//JogosEletronicos jg = new JogosEletronicos(); 
		//this.jg.TipoJogo.add(jg);
		return this;
	}
	public JgBuild addNome(String nome) {
		
		return this;
	}

	
		
	public JgBuild addValor(double valor) {
		this.jg.setValor(valor);
		return this;
	}
	
}
