package com.example.armazemJenipapo;

public class Fornecedor extends Pessoa {
    private int idFornecedor;
    private int cnpj;
    private String dataCadastro;

    public Fornecedor() {super();}

    public Fornecedor(int idFornecedor, String nome, int cnpj, String logradouro, String bairro, String cidade, String estado, int cep, String telefone, String email, String dataCadastro, String dataNascimento) {

        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email, dataNascimento);

        this.idFornecedor = idFornecedor;
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
    }


    public int getIdFornecedor() {return idFornecedor;}

    public void setIdFornecedor(int idFornecedor) {this.idFornecedor = idFornecedor;}


    public int getCnpj() {return cnpj;}

    public void setCnpj(int cnpj) {this.cnpj = cnpj;}


    public String getDataCadastro() {return dataCadastro;}

    public void setDataCadastro(String dataCadastro) {this.dataCadastro = dataCadastro;}
}