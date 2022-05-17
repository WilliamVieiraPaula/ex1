package view;

import java.util.ArrayList;

import model.Calcados;
import model.CalcadosBiuld;
import model.Camiseta;
import model.CamisetaBuild;
import model.EquipamentosInformatica;
import model.JogosEletronicos;

public class CadastroBuilder {

	public static void main(String[] args) {
		
		ArrayList <Calcados>listaC= new ArrayList();
		ArrayList <Camiseta>listaCa= new ArrayList();
		ArrayList <EquipamentosInformatica>listaEP= new ArrayList();
		ArrayList <JogosEletronicos>listaJE= new ArrayList();
		
		Calcados cal= CalcadosBiuld.builder()
				.addCor("rosa")
				.AddTamanho(35)
				.addTipo("Social")
				.addValor(558.52);
			listaC.add(cal);
		Calcados cal2= CalcadosBiuld.builder()
				.addCor("preyo")
				.AddTamanho(40)
				.addTipo("Social")
				.addValor(558.52);
		listaC.add(cal2);

		Calcados cal3= CalcadosBiuld.builder()
				.addCor("azul")
				.AddTamanho(44)
				.addTipo("Social")
				.addValor(558.52);
		listaC.add(cal3);
		
		
//camiseta
		Camiseta c = CamisetaBuild.builder()
				.addCor("azul")
				.addMarca("prada")
				.addValor(565.44)
				.AddTamanho("pp");
				
		listaCa.add(c);
		Camiseta c1 = CamisetaBuild.builder()
				.addCor("preto")
				.addMarca("prada")
				.addValor(565.44)
				.AddTamanho("pp");
						
		listaCa.add(c1);
		Camiseta c2 = CamisetaBuild.builder()
				.addCor("rosa")
				.addMarca("prada")
				.addValor(565.44)
				.AddTamanho("pp");
								
				listaCa.add(c2);
								
	}
	
}
