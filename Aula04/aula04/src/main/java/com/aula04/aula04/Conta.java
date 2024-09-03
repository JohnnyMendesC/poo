package com.aula04.aula04;

public class Conta {
    // o que é do cliente? o que é da conta?

    int     id_conta;
    double  saldo;
    String  conta;
    String titular;

    void imprimeConta(){
        System.out.println("---------------------------");
        System.out.println(this.id_conta);
        System.out.println(this.titular);
        System.out.println(this.conta);
        System.out.println(this.saldo);
    }
}
