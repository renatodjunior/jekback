package usuario;

import java.util.ArrayList;
import java.util.List;

import item.Item;

public class Loja extends Usuario {
	String cnpj;
	String nomeLoja;
	String categoria;
	List<Item> itens = new ArrayList<Item>();
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public void removeItem(Item item) {
		itens.remove(item);
	}
	
	public List<Item> listItens() {
		return this.itens;
	}
}
