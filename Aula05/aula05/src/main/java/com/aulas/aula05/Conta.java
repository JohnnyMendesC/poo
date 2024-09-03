package com.aulas.aula05;

public class Conta {
    int id;
    String numero;
    Agencia agencia;
    Cliente titular;
    String dataAbertura;
    //resolver o problema das especificidades com herança
    String tipo;//poupança, salário, corrente
    private double saldo;
    char classificacao;//A, B, C ou D
    String status;//ativa, bloqueada, suspensa(30 dias), em analise, inativa

    
    // Métodos

    public void setSaldo(double saldo){
        //ele vai determinar como eu posso alterar o atributo saldo
        //é aqui que vai rolar a proteção para que somente quem passar 
        //por este metodo que vai poder alterar o saldo, e não qualquer um
        this.saldo = saldo;

    }

    void exibeSaldo(){
        System.out.println("Conta: "+this.numero);
		System.out.println("Titular: "+this.titular.nome);
		System.out.println("Seu saldo é: R$"+this.saldo);

    }
}
