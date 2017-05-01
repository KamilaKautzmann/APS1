package com.senac.aps.exercicio.dois;

public class ContaBancaria {

	private double saldo = 0;
	private double saque = 0;
	private double deposito = 0;

	public ContaBancaria(double saldo) {
		this.saldo = saldo;

	}

	public boolean saque(double saque) {

		if (this.saldo >= saque) {
			this.saldo -= saque;
			return true;
		} else {
			return false;
		}
	}

	public double deposito(double deposito) {
		return this.saldo + deposito;
	}

}
