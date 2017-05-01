package com.senac.aps.exercicio.principal;

import com.senac.SimpleJava.Console;
import com.senac.aps.exercicio.dois.Cliente;
import com.senac.aps.exercicio.dois.ContaBancaria;
import com.senac.aps.exercicio.quatro.Temperatura;
import com.senac.aps.exercicio.tres.Pessoa;
import com.senac.aps.exercicio.um.Circulo;

public class Principal {

	public void run(){
		Console.println("----------------EXERC�CIO UM-------------------");
		
		Circulo circuloum = new Circulo(5, 1, 1);
		Circulo circulodois = new Circulo(5, 1, 1);
		
		circuloum.andar();
		Console.println("Contato "+circuloum.verificarContato(circulodois));
		Console.println("�rea "+circuloum.area());
		Console.println("Circufer�ncia "+circuloum.circunferencia());
		
		Console.println("----------------EXERC�CIO DOIS-------------------");
		
		ContaBancaria conta = new ContaBancaria(500.0);
		Cliente cliente = new Cliente(conta);
		cliente.depositar(100);
		Console.println(cliente.Sacar(500));
		
		Console.println("----------------EXERC�CIO TR�S-------------------");
		
		Pessoa pessoa = new Pessoa("09/09/1994",22,"Virgem");
		
		Console.println("----------------EXERC�CIO QUATRO-------------------");
		
		Temperatura temp = new Temperatura(100,"C");
		
		Console.println("Cem graus em celsius equivalem a"+temp.farenheit()+"F");
		
	}
	
	
	
}
