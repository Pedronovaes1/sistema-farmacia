package org.dobakcaofront.model;

public class Item {
    //atributos
    private String nome;
    private int codigo;
    private int quatidade;
    private String tipo;

    public Item(String nome, int codigo, int quatidade, String tipo) {
        this.nome = nome;
        this.codigo = codigo;
        this.quatidade = quatidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
