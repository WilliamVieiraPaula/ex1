package model;

public class CamisetaBuild {


		private Camiseta camiseta;
		
		public CamisetaBuild() {
			this.camiseta= new Camiseta();
		}
		
		public static CamisetaBuild builder() {
			return new CamisetaBuild();
		}
		
		public Camiseta AddTamanho(String string) {
			Camiseta c = new Camiseta(); 
			this.AddTamanho(string);
			return c;
		}
		public CamisetaBuild addCor(String cor) {
			this.camiseta.setCor(cor);
			return this;
		}
		public CamisetaBuild addMarca(String marca) {
			this.camiseta.setMarca(marca);
			return this;
		}
		
			
		public CamisetaBuild addValor(double valor) {
			this.camiseta.setValor(valor);
			return this;
		}
	}


