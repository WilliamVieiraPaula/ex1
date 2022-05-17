package model;

public class EpBuild {

	private EquipamentosInformatica ep;
	
	public EpBuild() {
		this.ep= new EquipamentosInformatica();
	}
	
	public static EpBuild builder() {
		return new EpBuild();
	}

	
	public EpBuild AddinfoTipo(EquipamentosInformatica ep) {
		EquipamentosInformatica equip = new EquipamentosInformatica(); 
		//this.ep.infoTipo.add(ep);
		return this;
	}
	public EpBuild addCapacidade(String cap) {
		this.ep.setCapacidade(cap);
		return this;
	}
	public EpBuild addFabricante(String fab) {
		this.ep.setFabricante(fab);
		return this;
	}
	
		
	public EpBuild addValor(double valor) {
		this.ep.setValor(valor);
		return this;
	}
	}
