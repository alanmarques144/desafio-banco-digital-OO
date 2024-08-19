package com.dio.desafio.bancodigital;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("alan");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		poupanca.descontarTaxa(10);
		cc.descontarTaxa(12);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
