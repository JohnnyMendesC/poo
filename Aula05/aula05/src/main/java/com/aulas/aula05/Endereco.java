package com.aulas.aula05;

public class Endereco {
    int id;
    String logradouro;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String cep;

    void imprimeEndereco(){
        System.out.println("---------");
        System.out.println("ENDEREÇO:");
        System.out.println(this.logradouro);
        System.out.println(this.numero);
        System.out.println(this.complemento);
        System.out.println(this.bairro);
        System.out.println(this.cidade);
        System.out.println(this.estado);
        System.out.println(this.cep);
    }

}
