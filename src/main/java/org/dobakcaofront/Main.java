package org.dobakcaofront;


import org.dobakcaofront.controller.BancoDeDados;
import org.dobakcaofront.model.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Farmácia");

        Item dipirona = new Item("Dipirona 500mg", 1020, 100, "Caixa");

        Item bromopride = new Item("bromopride 500mg", 1220, 50, "Caixa");

        BancoDeDados banco = new BancoDeDados();
        banco.cadastrar(dipirona);
        banco.cadastrar(bromopride);
    }
}