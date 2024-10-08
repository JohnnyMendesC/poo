package com.aulas.aula7;

public class Agencia {
    private int id;
    private String nome;
    private String numero;
    private String telefone;
    private Gerente gerenteGeral; //gerenteresponsavel@email ganha o dobro
    private Endereco endereco;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Gerente getGerenteGeral() {
        return gerenteGeral;
    }
    public void setGerenteGeral(Gerente gerenteGeral) {
        this.gerenteGeral = gerenteGeral;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
