package com.aula04.aula04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula04ClassesObjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aula04ClassesObjetosApplication.class, args);

		/*int numero1;
		numero1 = 0;
		numero1 = 5;*/

		/* EXEMPLO SÓ COM O ENDEREÇO E NOME:
		//Classe	variavel objeto   ação  
		ClientePessoaFisica cliente = new ClientePessoaFisica();
		cliente.nome = "Marina Mayumi";
		
		System.out.println(cliente); //com.aula04.aula04.ClientePessoaFisica@2580c316 <--- ele aponta o endereço na memoria
		//aqui voce acessa o objeto, não o atributo, talvez voce esteja buscando o atributo
		
		ClientePessoaFisica cliente2 = cliente;// ela aponta pro mesmo lugar, e guarda ambas variáveis no mesmo endereço
		System.out.println(cliente);//	@2580c316
		System.out.println(cliente2);//	@2580c316 
		
		System.out.println(cliente.nome);//assim voce acessa o atributo especifico do objeto
		System.out.println(cliente2.nome);//o valor é o mesmo do de cima
		*/

		ClientePessoaFisica cliente = new ClientePessoaFisica();
		cliente.nome = "Marina Mayumi";
		cliente.cpf = "123456789-00";
		cliente.dataNascimento = "01/01/2000";
		cliente.login = "m_yumi";
		cliente.senha = "mayumi";
		cliente.email = "m@gmail.com";
		cliente.telefone = "24999998888";

		ClientePessoaFisica julia = new ClientePessoaFisica();
		julia.cpf = "123654987-00";
		julia.nome = "Julia";



//		Instanciando um novo objeto end do tipo Endereco

//		|Classe	 |variavel |Método Construtor do objeto
		Endereco end = new Endereco(); 		//primeiro instancia
//					   |new=comando

//		Atribuição do end para o atributo endereco da classe
		cliente.endereco = end; 			//daí atribui ao cliente
//											  agora o objeto existe
		cliente.endereco.cep = "20.202-202"; //e pode adicionar um valor
		cliente.endereco.bairro = "Castatinha";
		cliente.endereco.cidade = "Petropolis";

		end.imprimeEndereco();
		
		/*EXEMPLO DE SYSOUTPRNT UM POR UM:
		System.out.println(cliente);//ainda vai indicar o caminho mesmo com tudo preenchido

		System.out.println(cliente.nome);
		System.out.println(cliente.cpf);
		System.out.println(cliente.dataNascimento);
		System.out.println(cliente.login);
		System.out.println(cliente.senha);
		System.out.println(cliente.email);
		System.out.println(cliente.telefone);
		//agora vai aparecer cada system out print
		//para isso se cria um método la no objeto, linha 16 do ClientePessoaFisica */

		

		//criar ClientePessoaJuridica, Gerente, Atendente, Agencia, Conta
		

		Conta conta = new Conta();  //FK cliente_id
		cliente.conta = conta;

		conta.titular = "Fulano";
		conta.conta = "1A9b-401";
		conta.saldo = 1.99d;

		//EXEMPLO PRINT GENERALIZADO
		cliente.imprimeFicha();
		julia.imprimeFicha();
	}
}
