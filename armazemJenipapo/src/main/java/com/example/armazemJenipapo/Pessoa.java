package com.example.armazemJenipapo;

public abstract class Pessoa {

    private String nome;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String telefone;
    private String email;
    private String dataNascimento;

    Pessoa(){}

    Pessoa(String nome, String logradouro, String bairro, String cidade, String estado, int cep, String telefone, String email, String dataNascimento){

        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}


    public String getLogradouro() {return logradouro;}

    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}


    public String getBairro() {return bairro;}

    public void setBairro(String bairro) {this.bairro = bairro;}


    public String getCidade() {return cidade;}

    public void setCidade(String cidade) {this.cidade = cidade;}


    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}


    public int getCep() {return cep;}

    public void setCep(int cep) {this.cep = cep;}


    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}


    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}


    public String getDataNascimento() {return dataNascimento;}

    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}

}
