package entities;

import java.util.ArrayList;
import java.util.List;

import util.CartaoDeCredito;

public class Cliente {
	
	private String nome;
	private String cpf;
	private List<CartaoDeCredito> cartoes = new ArrayList<>();
	
	public Cliente() {
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void adicionarCartao(CartaoDeCredito cartao) {
		this.cartoes.add(cartao);
	}
	
	
	public List<CartaoDeCredito> getCartoes() {
		return cartoes;
	}
	
	
}
