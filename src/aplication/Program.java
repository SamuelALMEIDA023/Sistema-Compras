package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Compra;
import util.CartaoDeCredito;
import util.SistemaDeCompras;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<CartaoDeCredito> cartoes = new ArrayList<>();
		List<Compra> listaDeCompras = new ArrayList<>();
		
		CartaoDeCredito cartao = new CartaoDeCredito();
		Cliente cliente = new Cliente();
		Compra compras = new Compra();
		
		
		SistemaDeCompras sistCompra = new SistemaDeCompras();
		
		
		SistemaDeCompras.cadastrarCartao(cliente, cartao);
		System.out.println();
		
		SistemaDeCompras.realizarCompra(cartao, compras);
		System.out.println();
		
		SistemaDeCompras.listarCompras(cartao);
		System.out.println();
		
		SistemaDeCompras.exibirResumo(cliente);
		
		sc.close();
	}

}
