package com.senac.aps.exercicio.tres;

import java.time.LocalDate;

public class Pessoa {

	private LocalDate DataNasci;
	private int idade = 0;
	private String signo = "";
	
	public Pessoa(String DataNasci, int idade, String signo) {
		this.idade = idade;
		this.signo = signo;
		
		String[] data = DataNasci.split("/");
		this.DataNasci = LocalDate.of(Integer.parseInt(data[2]),Integer.parseInt(data[1]),Integer.parseInt(data[0]));
		
	}
	
		
	
}
