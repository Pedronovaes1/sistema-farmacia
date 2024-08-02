package org.dobakcaofront;


import org.dobakcaofront.controller.BancoDeDados;
import org.dobakcaofront.model.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");


        BancoDeDados banco = new BancoDeDados();
        ArrayList<Item> itens = banco.ler();

        Item item = banco.pesquisar(4, itens);
        System.out.println(item.getNome());

        /*for(int i =0; i<itens.size(); i++){
            System.out.println("Código: "+ (i+1) + " Nome: " + itens.get(i).getNome()
                    + " Quatidade: " + itens.get(i).getQuatidade()
                    + " Tipo: "+ itens.get(i).getTipo());
        }*/


    }
}