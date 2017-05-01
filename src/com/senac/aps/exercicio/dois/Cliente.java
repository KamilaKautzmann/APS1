package com.senac.aps.exercicio.dois;

public class Cliente {

	private ContaBancaria conta;
	
	public Cliente(ContaBancaria conta){
		this.conta = conta;
	}
	
	public boolean Sacar(double valor){
		return this.conta.saque(valor);
	}
	
	public double depositar(double valor){
		return this.conta.deposito(valor);
	}
	
}
