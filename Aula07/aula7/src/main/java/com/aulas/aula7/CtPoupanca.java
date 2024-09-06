package com.aulas.aula7;


public class CtPoupanca extends Conta{
    //ATRIBUTOS
    private String tipoID;
    
    private String status;  // (ativa), bloqueada, suspensa(30 dias), em analise, inativa
    
    
    //boolean temCartao       //S N
    //double faturaBoletoCartao       //
    
    //CONSTRUTOR
    public CtPoupanca(){
        tipoID = ("P-5000-"+getId());
    }

    
    
    //MÉTODOS
    @Override
    public void imprimeConta(){        
    }    
    public void transferencia(int tipoTransf, double valor, Conta destino){
        System.out.println("Conta poupança");
    }


    
    //GETTERS SETTERS
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTipoID() {
        return tipoID;
    }
    
    
}