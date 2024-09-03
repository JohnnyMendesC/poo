package com.aula04.aula04;

public class ClientePessoaFisica {
    int         id_cliente;
    String      cpf;
    String      nome;
    String      dataNascimento;
    String      login;
    String      senha;
    String      email;
    String      telefone;
    Endereco    endereco;//endereco é outra classe é tipo um FK endereco_id
    Conta       conta;


    

    

    //Método
    void imprimeFicha(){
        System.out.println("---------------------------");
        System.out.println("-------DADOS-PESSOA--------");
        System.out.println("---------------------------");
        System.out.println(this.id_cliente);
        System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println(this.login);
		System.out.println(this.senha);
		System.out.println(this.email);
		System.out.println(this.telefone);
		System.out.println(this.endereco.cep);
		this.endereco.imprimeEndereco(); //chama esse metodo imprime Endereco que foi descrito na Classe Endereco e irá imprimir pois la está sysoutprint()
        this.conta.imprimeConta();

        /* o this retorna para quem chama, se o cliente1 chama
        ele imprime os dados do cliente1, se for o
        cliente2 ele imprime deste cliente2 
        dessa forma qualquer objeto pode chamar o método
        pois é genérico */
    }
}
