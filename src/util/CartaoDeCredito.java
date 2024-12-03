package util;

import java.util.ArrayList;
import java.util.List;

import entities.Compra;

public class CartaoDeCredito {
	
	private String numeroCartao;
	private Double limite;
	private Double saldoDisponivel;
	private List<Compra> compras = new ArrayList<>();
	
	public CartaoDeCredito() {
	}
	
	public CartaoDeCredito(String numeroCartao, Double limite, Double saldoDisponivel) {
		this.numeroCartao = numeroCartao;
		this.limite = limite;
		this.saldoDisponivel = limite;
	}
	
	public CartaoDeCredito(String numeroCartao, Double limite) {
		this.numeroCartao = numeroCartao;
		this.limite = limite;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	
	public boolean realizarCompra(Compra compra) {
		if(limite >= compra.getValor()) {
			compras.add(compra);
			return true;
		} else {
			return false;
		}
	}
	
	public List<Compra> getCompras() {
		return compras;
	}
	
}
