package com.senac.aps.exercicio.um;

public class Circulo {

	private final double PI = 3.14;

	private double raio = 0;
	private double posicaox = 0;
	private double posicaoy = 0;

	private double pxDireita = 0;
	private double pyCima = 0;
	private double pxEsquerda = 0;
	private double pyBaixo = 0;

	public Circulo(double raio, double px, double py) {
		this.raio = raio;
		this.posicaox = px;
		this.posicaoy = py;

		this.pxDireita = raio + px;
		this.pxEsquerda = raio - px;
		this.pyCima = raio + py;
		this.pyBaixo = raio - py;
	}

	public double circunferencia() {
		return this.PI * this.raio * 2;
	}

	public double area() {
		return this.PI * this.raio * this.raio;
	}

	public void andar() {
		this.posicaox += 1;
		this.posicaoy += 1;

		this.pxDireita = raio + this.posicaox;
		this.pxEsquerda = raio - this.posicaox;
		this.pyCima = raio + this.posicaoy;
		this.pyBaixo = raio - this.posicaoy;
	}

	public boolean verificarContato(Circulo circulo) {
		boolean contato = false;

		if (this.pxDireita > circulo.pxDireita ^ this.pxDireita > circulo.pxEsquerda) {
			contato = true;
		}

		if (this.pxEsquerda > circulo.pxDireita ^ this.pxEsquerda > circulo.pxEsquerda) {
			contato = true;
		}

		if (this.pyCima > circulo.pyCima ^ this.pyCima > circulo.pyBaixo) {
			contato = true;
		}

		if (this.pyBaixo > circulo.pyCima ^ this.pyBaixo > circulo.pyBaixo) {
			contato = true;
		}

		return contato;

	}

}
