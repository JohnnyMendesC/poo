package com.aulas.aula7;

    public abstract class Conta {
        public static int contadorId = 900; //esse atributo é static, então ele não é da conta1 ou conta2, ele é do objeto Conta
        public static int contadorNumero = 1000;
        
        //Atributos da pessoa
        private int id;                 // geração automática
        private String numero;          // geração automática
        private Agencia agencia;        // associada a agencia do gerente
        private Pessoa titular;        // gerente informa
        
        
        
        private String dataAbertura;    // String 08/09/20 data de abertura do momento LocalDateTime.now();
        private char classificacao;     // A*, B, C ou D
        private double saldo=1000d;
        
        //CONSTRUTOR
        
        //METODOS
        public abstract void transferencia(int tipoTransf, double valor, Conta destino);
        //transferencia equivale pix- transferencia-valorA+valorB saque-valor deposito+valor
        
        public abstract void imprimeConta();
        
        
        public int getId() {
            return id;
        }
        
        
        public void setId() {
            this.id = (contadorId); contadorId++;
        }
        
        public static int getContadorNumero() {
            return contadorNumero;
        }
        
        
        public static void setContadorNumero(int contadorNumero) {
            Conta.contadorNumero = contadorNumero;
        }
        
        
        public Pessoa getTitular(){
            return titular;
        }

        public void setTitular(Pessoa titular) {
            this.titular = titular;
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

    public String getDataAbertura() {
        return dataAbertura;
    }


    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }


    public char getClassificacao() {
        return classificacao;
    }


    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
