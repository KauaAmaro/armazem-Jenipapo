package com.example.armazemJenipapo;

public class Estoque {

    private Produto nomeProduto;
    private int quantidade;

    public Estoque(Produto nomeProduto, int quantidade) {

        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {return nomeProduto.getNome();}

    public void setNomeProduto(String nomeProduto) {this.nomeProduto.setNome(nomeProduto);}


    public int getQuantidade() {return quantidade;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}


    public void adicionarQuantidade(int quantidadeAdicional) {
        quantidade += quantidadeAdicional;
    }

    public void removerQuantidade(int quantidadeRemover) {
        if (quantidadeRemover > 0 && quantidadeRemover <= quantidade) {
            quantidade -= quantidadeRemover;
        } else {
            System.out.println("Quantidade inválida. Nenhuma alteração feita no estoque.");
        }

    }

}
