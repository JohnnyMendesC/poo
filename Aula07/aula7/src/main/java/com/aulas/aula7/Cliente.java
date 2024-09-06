package com.aulas.aula7;

public class Cliente extends Pessoa {
    //ATRIBUTOS

    String login; //boiler plate
    String senha;
    //private char classificacao; // A*, B, C ou D // onde ficaria melhor a classificação?


    //CONSTRUTORES
    public Cliente(){
        /* 
        cpf;
        dataNascimento;
        endereco;
        email;
        telefone;
        login;
        senha;*/
    }



    //METODOS
    public void imprimeFicha(){
        System.out.println("======================");
        System.out.println("| DADOS  DE  CLIENTE |");
        System.out.println("======================");
        System.out.println("Id:"+getId());
        System.out.println("Nome: "+getNome());
		System.out.println("CPF: "+getCpf());
		System.out.println("Data Nascimento: "+getDataNascimento());
		System.out.println("Login: "+getEndereco().getLogradouro());
		System.out.println("Email: "+getEmail());
		System.out.println("Telefone: "+getTelefone());
        
    }
    //GETTERS SETTERS

    public String nome(){
        return getNome();
    }

    public String getLogin() {
        return login;
    }



    public void setLogin(String login) {
        this.login = login;
    }



    public String getSenha() {
        return senha;
    }



    public void setSenha(String senha) {
        this.senha = senha;
    }












/*
    public static int contadorId = 300;
    

    private int id;                 //geração automática
    private String nome;            //pessoa informa
    private String cpf;             //pessoa informa
    private String dataNascimento;  //pessoa informa
    private String login;           //automáticocpf
    private String senha;           //automático
    private Endereco endereco;      //pessoa informa
    private String email;           //pessoa informa
    private String telefone;        //pessoa informa
    //escrever os gets e sets

    //Construtor
    public Cliente(String nome, String cpf, String dataNascimento, String email, String telefone){//construtor
        this.id = (contadorId); contadorId++;
        this.login = Geradores.geradorDeLetra();
        this.senha = Geradores2.gerarSenha();
        //this.endereco = Endereco.Endereco();

        
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }/*
    public Cliente(){
    this.id = (contadorId); contadorId++;
    this.login = Geradores.geradorDeLetra();
    this.senha = Geradores2.gerarSenha();
    }

    // Método
    public void imprimeFicha(){
        System.out.println("======================");
        System.out.println("| DADOS  DE  CLIENTE |");
        System.out.println("======================");
        System.out.println("Id:"+this.getId());
        System.out.println("Nome: "+this.getNome());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Data Nascimento: "+this.getDataNascimento());
		System.out.println("Login: "+this.getLogin());
		System.out.println("Senha: "+this.getSenha());
		System.out.println("Email: "+this.getEmail());
		System.out.println("Telefone: "+this.getTelefone());
        
		this.endereco.imprimeEndereco();
    }

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


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        */ 
}
