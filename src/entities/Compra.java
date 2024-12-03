package entities;

public class Compra {
	
	private String descricao;
	private Double valor;
	
	public Compra() {
	}
	
	public Compra(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
