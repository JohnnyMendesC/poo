package com.aulas.aula7;

public class CtCorrente extends Conta{ 
    //Atributos
    public String contadorTipoId; 
    
    private int tipoId;
    private double anuidade;                    //corrente    
    //private boolean cartaoDeCredito;          //sim nao
    private String status;                      // (ativa), bloqueada, suspensa(30 dias), em analise, inativa    
    private double saldo;                       // saldo começa igual a 0
    private int tipoTransferencia;              //pix, transferencia, deposito em dinheiro/cheque, saque em dinheiro/cheque
    
    //Construtor
    public CtCorrente(){
        this.tipoId=getId();
        this.contadorTipoId=("C-8000-"+this.tipoId);
    }
    
    
    @Override
    //Metodos
    public void transferencia(int tipoTransf, double valor, Conta destino){
        System.out.println("Conta corrente");
        System.out.println("Qual operação deseja realizar?");
        
        tipoTransf = this.tipoTransferencia;
        
        switch (tipoTransferencia){
            
            case 1:
            System.out.println("Transferência"); 
            // transferencia - ted data cai no mesmo dia | doc data cai no dia seguinte
            // saldoA-- -> (valor) -> saldoB++     
            if (this.saldo >= valor){
                setSaldo(saldo-valor);
                destino.setSaldo(destino.getSaldo()+valor);
            }
            else {
                System.out.println("Saldo insuficiente.");
            }   
            break;
            
            
            case 2:
            System.out.println("pix"); 
            // pix - cai na mesma hora
            // saldoA-- -> (valor) -> saldoB++ 
            break;
            
            
            case 3: 
            // saque - sai o valor da conta
            // saldoA-- -> (valor)
            if (this.saldo >= valor){
                setSaldo(saldo-valor);
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
            break;
            
            
            case 4: 
            System.out.println("Deposito: "); 
            // deposito - entra o valor na conta    
            // (valor) -> saldoA++
            destino.setSaldo(destino.getSaldo()+valor);        
            break;
            
            case 5:
            System.out.println("Rendimento: "); //talvez precise de um metodo proprio
            break;
        }
    }      
    public String getContadorTipoId() {
        return contadorTipoId;
    }
    
    public void imprimeConta(){
        getSaldo();
    }
    
    
    public double getAnuidade() {
        return anuidade;
    }
    
    public void setAnuidade(double anuidade) {
        this.anuidade = anuidade;
    }
    
    public String getStatus() {
            return status;
        }
        
        public void setStatus(String status) {
            this.status = status;
        }
}
