package org.dobakcaofront.controller;

import org.dobakcaofront.model.Item;

import java.io.*;

public class BancoDeDados {
    //atributos

    private Item item;

    public BancoDeDados() {
        this.item = item;
    }

    //método

    public void cadastrar(Item item){
        try{
        OutputStream os = new FileOutputStream("medicamentos.txt", true); //ela localiza o arquivo e caso não exista ela cria do zero
        OutputStreamWriter osw;
        BufferedWriter bw;
        }catch (Exception e){
            System.out.println("Não conseguiu cadastrar o medicamento");
            System.out.println(e);
        }
    }

    public void editar(int codigo){

    }

    public void pesquisar(int codigo){

    }

    public void excluir(int codigo){

    }
}
