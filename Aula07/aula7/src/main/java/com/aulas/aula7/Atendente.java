package com.aulas.aula7;

public class Atendente extends Funcionario {

    public void imprimeFicha(){

        //Dados da Pessoa
        System.out.println("======================");
        System.out.println("| DADOS DE ATENDENTE |");
        System.out.println("======================");
        System.out.println("Id:"+getId());
        System.out.println("Nome: "+getNome());
		System.out.println("CPF: "+getCpf());
		System.out.println("Data Nascimento: "+getDataNascimento());
		System.out.println("Login: "+getEndereco().getLogradouro());
		System.out.println("Email: "+getEmail());

        //Dados do funcionario
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Data da Admissao: "+getDataAdmissao());
		System.out.println("Data da Promocao: "+getDataPromocao());
		System.out.println("Salário: "+getSalario());
    }

}
