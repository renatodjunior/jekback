package item;

public class Item {

	Long idItem;
	String nome;
	String descricao;
	String categoriaItem;
	Float preco;
	Integer desconto;
	
	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoriaItem() {
		return categoriaItem;
	}
	public void setCategoriaItem(String categoriaItem) {
		this.categoriaItem = categoriaItem;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Integer getDesconto() {
		return desconto;
	}
	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}
	
	
	
}
