package com.aulas.aula7;

public class Gerente extends Funcionario {
    //classe abstract serve de modelo para as classes filhas "classefilha extends mãe"
    

    @Override //esse metodo sobrescreve o metodo que veio da herança(evita duplicidade de herança caso o nome seja diferente)

    //precisa implementar o método da superclasse
    public void imprimeFicha(){

        //Dados da Pessoa
        System.out.println("======================");
        System.out.println("| DADOS  DE  GERENTE |");
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



/*
//Dados da Pessoa (codigo boiler plate, codigo repetido, ele repete o ClientePessoaFisica)
int id;                 //geração automática
String nome;            //pessoa informa
String cpf;             //pessoa informa
String dataNascimento;  //pessoa informa
String login;           //automáticocpf
String senha;           //automático
Endereco endereco;      //pessoa informa
String email;           //pessoa informa
String telefone;        //pessoa informa

//Composição?:
Cliente gerente; essa seria uma maneira de resolver a duplicidade de dados
mas essa não é a ideal nesse caso, existem conflitos em ter uma classe Cliente gerente

//Dados do Funcionário
String matricula;
String dataPromocao;
double salario;
Agencia agenciaAlocado;
/*
//public void acessorRestrito(){
    //      //Gerente acessa todas funcionalidades  
    //      //Atendente acessa funcionalidades limitadas
    //}
    */