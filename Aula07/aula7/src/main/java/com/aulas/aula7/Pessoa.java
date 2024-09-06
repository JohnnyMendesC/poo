package com.aulas.aula7;

public abstract class Pessoa {
    //ATRIBUTOS
    public static int contadorId = 1;
    
    //classe abstract serve de modelo para as classes filhas "classefilha extends mãe"
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;
    private String email;
    private String telefone;
    private String login;
    private String senha;
    
    //METODOS
    public abstract void imprimeFicha();
    
    
    //GETTERS E SETTERS
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha, int id) {        
        this.login = Geradores.geradorDeLetra();
        this.senha = Geradores2.gerarSenha();
        this.senha = senha;
    }
    //Getters e Setters
    public int getId() {
        return id;
    }
    public void setId() {
        this.id = (contadorId); contadorId++;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }         
}