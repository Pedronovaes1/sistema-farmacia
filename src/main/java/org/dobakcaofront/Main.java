package org.dobakcaofront;


import org.dobakcaofront.controller.BancoDeDados;
import org.dobakcaofront.model.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        Item dipirona = new Item("Dipirona 500mg", 30, "Caixa");

        BancoDeDados banco = new BancoDeDados();
        ArrayList<Item> itens = banco.ler();

       banco.editar(1, itens);

        /*for(int i =0; i<itens.size(); i++){
            System.out.println("Código: "+ (i+1) + " Nome: " + itens.get(i).getNome()
                    + " Quatidade: " + itens.get(i).getQuatidade()
                    + " Tipo: "+ itens.get(i).getTipo());
        }*/


    }
}