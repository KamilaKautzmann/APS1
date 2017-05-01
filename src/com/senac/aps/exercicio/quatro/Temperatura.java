package com.senac.aps.exercicio.quatro;

public class Temperatura {

	private double temperatura = 0;
	private String tipo = "";

	public Temperatura(double temperatura, String tipo) {
		this.temperatura = temperatura;
		this.tipo = tipo;
	}

	public double celsius() {
		if (this.tipo == "F") {
			this.temperatura = (this.temperatura * 1.8) + 32;
			this.tipo = "C";
		}
		return this.temperatura;
	}

	public double farenheit() {
		if (this.tipo == "C") {
			this.temperatura = (this.temperatura - 32) / 1.8;
			this.tipo = "F";
		}
		return this.temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.tipo = temperatura.substring(temperatura.length() - 1);
		this.temperatura = Double.parseDouble(temperatura.substring(0, -1));
	}
}
