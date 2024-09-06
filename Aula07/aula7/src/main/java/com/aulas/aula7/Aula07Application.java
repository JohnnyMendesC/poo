package com.aulas.aula7;

//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula07Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula07Application.class, args);

		
		Pessoa gerente = new Gerente();
		// Gerente pessoa1 = new Gerente(); poderia
		// Gerente pessoa1 = new Pessoa(); não poderia

		gerente.setNome("ABC");
		System.out.println(gerente.getNome()); //imprimir o nome

		gerente.getNome();


		/*
		Cliente cliente1 = new Cliente("Nome1", "123", "Jan96", "1@com", "2422");		
		
		Cliente cliente2 = new Cliente("Nome2", "456", "Dez96", "2@com", "2423");		
		
		Cliente cliente3 = new Cliente("Nome3", "789", "Jul96", "3@com", "2424");		
		
		Endereco endereco1 = new Endereco("Rua A", "5", "Casa 2", "Mosela", "Petrópolis", "RJ", "25600-000");
		
		Endereco endereco2 = new Endereco("Rua S", "857", "Casa 9", "Centro", "Petrópolis", "RJ", "25100-000");
		
		Endereco endereco3 = new Endereco("Rua 9", "12", "Casa 4", "Quissamã", "Petrópolis", "RJ", "25500-000");
		
		cliente1.imprimeFicha();
		endereco1.imprimeEndereco();

		cliente2.imprimeFicha();
		endereco2.imprimeEndereco();
		
		cliente3.imprimeFicha();
		endereco3.imprimeEndereco();*/



		/* 		
		Conta conta1 = new Conta(cliente1, "Corrente");
		Conta conta2 = new Conta(cliente2, "Corrente");
		Conta conta3 = new Conta(cliente3, "Corrente");

		System.out.println(conta1.getId());
		System.out.println(conta2.getId());
		System.out.println(conta3.getId());

		System.out.println(Conta.contadorId);

		
		System.out.println(conta1.getNumero());
		System.out.println(conta2.getNumero());
		System.out.println(conta3.getNumero());

		System.out.println(Conta.contadorNumero);*/

		//1) Escrever as Classes do projeto
		//2) Os atributos das classes privados e escrever os Gets e Sets
		//3) Escrever os construtores
		//4) As particularidades de cada Classe
/*
PESSOA
CLIENTE
FUNCIONARIO
ATENDENTE 
GERENTE

	PESSOA
	/	  \
	

	*/
	}
}
