package com.aulas.aula7;

//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula07Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula07Application.class, args);

		
		Pessoa gerente15 = new Gerente();
		Pessoa gerente20 = new Gerente();
		// Gerente pessoa1 = new Gerente(); poderia
		// Gerente pessoa1 = new Pessoa(); não poderia
		gerente15.setNome("ABC");
		gerente20.setNome("BCD");
		gerente15.setId();
		gerente20.setId();


		Pessoa cliente1 = new Cliente();	//cria a Pessoa como Cliente
		cliente1.setNome("Arthur");	//nomeia
		System.out.println("client1: "+cliente1.getNome());		
		Conta cc1 = new CtCorrente();		//cria a Conta como ContaCorrente cc1
		cc1.setTitular(cliente1);			//seta o cliente1 como titular da cc1
		System.out.println("Titular da cc1: "+cc1.getTitular().getNome());
		cliente1.setId();
		System.out.println("ID cliente1: "+cliente1.getId());
		cc1.setId();
		System.out.println("ID da Conta da cc1 : "+cc1.getId());
		//System.out.println("TipoID da cc1 : "+((CtCorrente) cc1).getContadorTipoId());//ele concatena "TipoID da cc1 : C-8000-0" mas não adiciona o id 900, e sim um 0, o certo seria C-8000-900

		

		Pessoa cliente2 = new Cliente();
		cliente2.setNome("Roni");
		System.out.println("client2: "+cliente2.getNome());
		Conta cp2 = new CtPoupanca();
		cp2.setTitular(cliente2);
		System.out.println("Titular da Conta cp2: "+cp2.getTitular().getNome());
		cliente2.setId();
		System.out.println("ID cliente1: "+cliente2.getId());
		cp2.setId();
		System.out.println("ID da cp2 : "+cp2.getId());



		

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
