package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import entities.Compra;

public class SistemaDeCompras {
	
	public static void cadastrarCartao(Cliente cliente, CartaoDeCredito cartao) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro Cliente: ");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		cliente.setNome(nome);
		
		
		System.out.print("CPF do cliente: ");
		String cpf = sc.next();
		cliente.setCpf(cpf);
		
		System.out.println();
		System.out.println("Cadastro cartão: ");
		System.out.print("Informe o numero do seu cartão: ");
		String numeroCartao = sc.next();
		cartao.setNumeroCartao(numeroCartao);
		
		System.out.print("limite do cartão: ");
	    Double limite = sc.nextDouble();
	    cartao.setLimite(limite);
	    
	    cliente.adicionarCartao(cartao);
	}
	
	public static void realizarCompra(CartaoDeCredito cartao, Compra compras) {
		    Scanner sc = new Scanner(System.in);
		    List<Compra> comprasRealizadas = new ArrayList<>();
		    String opcao;		
		    
		    do {
		    	
		    	System.out.println("Deseja efetuar compra? ");
			    System.out.println("1 - Efetuar nova compra");
			    System.out.println("2 - Sair");
			    opcao = sc.next();
			    
			    if(opcao.equals("1")) {
			    	 System.out.println("Informe suas compras: ");
					 System.out.print("Digite o nome do produto: ");
					 sc.nextLine();
					 String descricao = sc.nextLine();
					    
					 System.out.print("Valor: ");
					 double valor = sc.nextDouble();
					 System.out.println();
					 
					 Compra comp = new Compra(descricao, valor);
					 comprasRealizadas.add(comp);    
			    }
			   
		    } while(!opcao.equals("2"));
		    
			
		    for(Compra compra : comprasRealizadas) {
		        if(cartao.realizarCompra(compra)) {
					   System.out.println("Compra realizada: "+ compra.getDescricao() +" -  R$ "+ compra.getValor());
				  } else {
				       System.out.print("Limite insuficiente. Compra não realizada");
				  }
		    }
	}
	
	public static void listarCompras(CartaoDeCredito cartao) {
		System.out.println("Compras realizadas no cartao " + cartao.getNumeroCartao() + ": ");
		
		List<Compra> compras = cartao.getCompras();
		
		if (compras == null || compras.isEmpty()) {
	        System.out.println("Nenhuma compra foi realizada.");
	        return;
	    }
		
		for(Compra compra : compras) {
			System.out.println((compras.indexOf(compra) + 1) +". "+ compra.getDescricao() + " - "+ compra.getValor());
		}
	}
	
	public static void exibirResumo(Cliente clientes) {
		System.out.println("Resumo do cliente "+ clientes.getNome() + ": ");
		
		List<CartaoDeCredito> cartoes = clientes.getCartoes();
		
		for(CartaoDeCredito cartao : cartoes) {
		    System.out.println("Cartão: "+ cartao.getNumeroCartao());
		}
		
		Double totalGasto = 0.0;
		
		for(CartaoDeCredito cartao : cartoes) {
		    List<Compra> compras = cartao.getCompras();
		    
		    for(Compra compra : compras) {
		    	totalGasto += compra.getValor();
		    }
		}
		
		System.out.println("Total gasto: R$ "+ totalGasto);
		
		for(CartaoDeCredito cartao : cartoes) {
			Double saldoDisponivel = cartao.getLimite() - totalGasto;
			System.out.println("Saldo disponivel: "+ saldoDisponivel);
		}
		
	}
}
