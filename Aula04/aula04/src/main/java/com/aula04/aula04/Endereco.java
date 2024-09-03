package com.aula04.aula04;

public class Endereco {
    int     id_end;
    String  logradouro;
    String  numero;
    String  complemento;
    String  bairro;
    String  cidade;
    String  estado;
    String  cep;

    void imprimeEndereco(){
        System.out.println("---------------------------");
        System.out.println(this.id_end);
        System.out.println(this.logradouro);
        System.out.println(this.numero);
        System.out.println(this.complemento);
        System.out.println(this.bairro);
        System.out.println(this.cidade);
        System.out.println(this.estado);
        System.out.println(this.cep);


    }
}
