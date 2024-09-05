package com.aula06.aula06;

public class Endereco {
    //private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

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
