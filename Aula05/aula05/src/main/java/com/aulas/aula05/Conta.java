package com.aulas.aula05;

public class Conta {
    private int id; // geração automática
    private String numero; // geração automática
    private Agencia agencia; // associada a agencia do gerente
    private Cliente titular; // gerente informa
    private String dataAbertura; // data de abertura do momento
    //resolver o problema das especificidades com herança
    private String tipo; // poupança, salário, corrente // gerente informa
    private double saldo; // saldo começa igual a 0
    private char classificacao; // A*, B, C ou D
    private String status; // (ativa), bloqueada, suspensa(30 dias), em analise, inativa
    //todos se tornam private

    // Construtores 
    public Conta(Cliente cliente, String tipo){ // o (Cliente cliente) pega o this.titular // depois terá o parametro (Agencia agencia) por causa do gerente
        //esse aqui anula o construtor generico do "Conta conta1 = new Conta()"
        //aqui os parametros quando cria a nova conta do zero

        this.id = 1; // O próximo deve ser 2
        this.saldo = 0;
        this.dataAbertura = "03/09/2024";
        this.numero = "1234-0"; // A próxima deve ser 1235-0
        this.classificacao = 'A';
        this.status = "Ativa";
        this.titular = cliente;
        this.tipo = tipo;
        //this.agencia = agencia;

    }

    public Conta(){
        //esse construtor com essa assinatura permitiria criar o construtor genérico de novo
        //"Conta conta4 = new Conta();"
    }

    // Getters e Setters é o padrão
    // Métodos  

    public int getId() {
        return id;
    }    
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    
    public String getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo){
        //ele vai determinar como eu posso alterar o atributo saldo
        //é aqui que vai rolar a proteção para que somente quem passar 
        //por este metodo que vai poder alterar o saldo, e não qualquer um
        //EX:
        //Dupla autenticação (gerente geral e mais um gerentes)
        this.saldo = saldo;
    }
    
    public char getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


//Outros Métodos
public void exibeSaldo(){
    System.out.println("Conta: "+this.numero);
    System.out.println("Titular: "+this.titular.nome);
    System.out.println("Seu saldo é: R$"+this.saldo);    
    }
    public void exibeDadosDaConta(){
        System.out.println("---------");
        System.out.println("DADOS DA CONTA:");
        System.out.println("Conta: "+this.numero);
        System.out.println("Titular: "+this.titular.nome);
        System.out.println("Seu saldo é: R$"+this.saldo);   
        System.out.println("Data de abertura: "+this.dataAbertura);
        System.out.println("Tipo Classificação: "+this.classificacao);
        System.out.println("Status: "+status);
        System.out.println("---------\n\n");
    }
}
