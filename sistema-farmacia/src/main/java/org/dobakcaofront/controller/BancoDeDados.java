package org.dobakcaofront.controller;

import org.dobakcaofront.model.Item;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BancoDeDados {
    //atributos

    private Item item;

    public BancoDeDados() {
        this.item = item;
    }

    //método

    public void cadastrar(Item item){
        OutputStream os = new FileOutputStream(" ", true); //ela localiza o arquivo e caso não exista ela cria do zero
        OutputStreamWriter osw;
        BufferedWriter bw;
    }

    public void editar(int codigo){

    }

    public void pesquisar(int codigo){

    }

    public void excluir(int codigo){

    }
}
