package com.aulas.aula05;

public class Cliente {

    int id;
    String nome;
    String cpf;
    String dataNascimento; 
    String login;
    String senha;
    Endereco endereco;
    String email;
    String telefone;
    //escrever os gets e sets

    // Método
    void imprimeFicha(){
        System.out.println("======================");
        System.out.println("| DADOS  DE  CLIENTE |");
        System.out.println("======================");
        System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println(this.login);
		System.out.println(this.senha);
		System.out.println(this.email);
		System.out.println(this.telefone);
        
		this.endereco.imprimeEndereco();
    }

}
