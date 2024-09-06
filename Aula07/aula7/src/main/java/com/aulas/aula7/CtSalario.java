package com.aulas.aula7;

public class CtSalario extends Conta { 
    //ATRIBUTOS  
    String tipoID;
    private String status;                      // (ativa), bloqueada, suspensa(30 dias), em analise, inativa
    

    //CONSTRUTORES
    public CtSalario(){
        tipoID = ("S-2000-"+getId());
    }

    //MÉTODOS
    @Override
    public void imprimeConta(){
        System.out.println(getSaldo());
    }

    public void transferencia(int tipoTransf, double valor, Conta destino){
        System.out.println("Conta salário");
    }

    //GETTER SETTER
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void transferencia(){    
        System.out.println("Conta não habilitada para realizar transferências.");
    }

}























/*
    //resolver o problema das especificidades com herança

    //todos se tornam private

    // Construtores 
    public Conta(Cliente cliente, String tipo){ // o (Cliente cliente) pega o this.titular // depois terá o parametro (Agencia agencia) por causa do gerente
        //esse aqui anula o construtor generico do "Conta conta1 = new Conta()"
        //aqui os parametros quando cria a nova conta do zero

        this.id = contadorId; contadorId++; // O próximo deve ser 2
        this.saldo = 0;
        //this.dataAbertura = "04/09/2024"; //rode um comando que busque a data daquele momento
        this.numero = (contadorNumero+"-0"); contadorNumero++; // A próxima deve ser 1001-0
        this.classificacao = 'A';
        this.status = "Ativa";
        // As informações que são passadas no momento em que o objeto é instanciado
        this.titular = cliente;
        this.tipo = tipo;
        //this.agencia = agencia;

    }

    
//Outros Métodos

    public void exibeDadosDaConta(){

        
        System.out.println("---------");
        System.out.println("DADOS DA CONTA:");
        System.out.println("Conta: "+this.numero);
        System.out.println("Titular: "+this.titular.getNome());
        System.out.println("Seu saldo é: R$"+this.saldo);   
        System.out.println("Data de abertura: "+this.dataAbertura);
        System.out.println("Tipo Classificação: "+this.classificacao);
        System.out.println("Status: "+status);
        System.out.println("Id: "+this.id);
        System.out.println("---------\n\n");

}*/
