package com.aulas.aula05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula05Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula05Application.class, args);

		//Criando um novo cliente
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Julia M";
		cliente1.cpf = "12345678900";
		cliente1.dataNascimento = "01/01/2000";
		cliente1.login = "juliaju";
		cliente1.senha = "jan";
		cliente1.email = "juulia@mail.com";
		cliente1.telefone = "24999998888";

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
		Conta conta1 = new Conta();
		conta1.numero = "1234-0";
		conta1.titular = cliente1;
		//conta1.saldo = 100d; //terá que substituir, pois não pode mais acessa-la daqui ja que se tornou private
		//agora somente é possível alterar pelo metodo .setSaldo() dentro da propria classe Conta
		conta1.setSaldo(5000);

		//conta2

		//conta2.saldo = 1000000000;

		conta1.exibeSaldo();
		System.out.println(conta1.saldo);


	}

}
