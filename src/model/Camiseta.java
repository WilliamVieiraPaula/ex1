package model;

public class Camiseta {
String cor;
String marca;
double valor;
public enum tamanho{
	PP, P, M, G, GG
}

public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}




}
