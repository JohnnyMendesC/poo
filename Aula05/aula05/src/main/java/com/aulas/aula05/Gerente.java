package com.aulas.aula05;

public class Gerente {
    

    //Dados da Pessoa (codigo boiler plate, codigo repetido, ele repete o ClientePessoaFisica)
    int id;
    String nome;
    String cpf;
    String dataNascimento;
    String login;
    String senha;
    Endereco endereco;
    String email;
    String telefone;
    
    //Composição:
/*  ClientePessoaFisica gerente; essa seria uma maneira de resolver a duplicidade de dados */

    //Dados do Funcionário
    String matricula;
    String dataPromocao;
    double salario;
    Agencia agenciaAlocado;

}

