package com.aula06.aula06;

//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula06Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula06Application.class, args);
/*
		//Criando um novo cliente
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Julia M";
		cliente1.cpf = "12345678900";
		cliente1.dataNascimento = "01/01/2000";
		cliente1.login = "juliaju";
		cliente1.senha = "jan";
		cliente1.email = "juulia@mail.com";
		cliente1.telefone = "24999998888";

		Cliente cliente2 = new Cliente();
		cliente2.nome = "Mend C";
		cliente2.cpf = "32145678900";
		cliente2.dataNascimento = "01/01/2001";
		cliente2.login = "Mendm";
		cliente2.senha = "mam";
		cliente2.email = "mandme@mail.com";
		cliente2.telefone = "24988998888";

		// Instanciando um novo objeto end do tipo endereco
		Endereco end = new Endereco();

		//Alimentando o objeto end
		end.cep = "20.202-202";
		end.bairro = "Cascatinha";
		end.cidade = "Petrópolis";

		//Atribuição do en para o atributo endereco da classe Cliente
		cliente1.endereco = end;

		cliente1.imprimeFicha();

		//Instanciando uma conta
		//Conta conta1 = new Conta();//esse contrutor deixa de existir quando cria um Construtor dentro da Classe
		//conta1.setNumero("1234-0");
		//conta1.setTitular(cliente1);
		//conta1.saldo = 100d; //terá que substituir, pois não pode mais acessa-la daqui ja que se tornou private
		//agora somente é possível alterar pelo metodo .setSaldo() dentro da propria classe Conta
		//conta1.setDataAbertura("02/09/2024");
		//conta1.setSaldo(5000);
		
		Conta conta1 = new Conta(cliente1, "Corrente");
		Conta conta2 = new Conta();
		
		//conta2
		//conta2.saldo = 1000000000;

		conta1.setClassificacao('B');

		conta1.exibeDadosDaConta();
		//conta2.exibeSaldo();
		//System.out.println(conta1.getSaldo());
		conta2.exibeDadosDaConta();

		System.out.println(cliente1.nome);
		//System.out.println(conta1.contadorId);//não funciona pois o contadorId é da classe Conta
		System.out.println(Conta.contadorId);*/

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();


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

		System.out.println(Conta.contadorNumero);
	}
}
