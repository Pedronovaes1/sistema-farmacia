package org.dobakcaofront.controller;

import org.dobakcaofront.model.Item;

import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {
    //atributos

    private Item item;

    public BancoDeDados() {
        this.item = item;
    }

    //método

    public void cadastrar(Item item, boolean opcao){
        try{
            //ela localiza o arquivo e caso não exista ela cria do zero
            OutputStream os = new FileOutputStream("medicamentos.txt", opcao);
            // Prepara o arquivo para a escrita
            OutputStreamWriter osw = new OutputStreamWriter(os);
            // Escreve os dados no osw
            BufferedWriter bw = new BufferedWriter(osw);

            // é uma linha que iremos armazenar
            String linha = item.getNome() + "," + item.getQuatidade() + ","+ item.getTipo();

            // Armazenamos a linha no arquivo
            bw.write(linha);
            // antes de salvar o arquivo, pulamos uma linha para não sobrescrever
            bw.newLine();

            //fechar conexão
            bw.close();
            osw.close();
            os.close();

            System.out.println("O medicamento " + item.getNome() + " foi cadastrado com sucesso.");
        }catch (Exception e){
            System.out.println("Não conseguiu cadastrar o medicamento");
            System.out.println(e);
        }
    }

    public void editar(int codigo, ArrayList<Item> itens){
        Item item = itens.get(codigo);
        itens.remove(codigo);
        item.setNome("Tilenol 200ml XPSK");
        item.setQuatidade(300);
        item.setTipo("Frasco de 200ml");

        itens.add(codigo,item);

        for(int i =0; i<itens.size(); i++){
            if(i==0){
                cadastrar(itens.get(i), false);
            }else{
                cadastrar(itens.get(i), true);
            }
        }
    }

    public Item pesquisar(int codigo, ArrayList<Item> itens){
        try{
        Item item = itens.get(codigo);
        return item;
        } catch (Exception e){
            System.out.println("O item não existe");
            return null;
        }
    }

    public void excluir(int codigo, ArrayList<Item> itens){
        itens.remove(codigo);

        for(int i =0; i<itens.size(); i++){
            if(i==0){
                cadastrar(itens.get(i), false);
            }else{
                cadastrar(itens.get(i), true);
            }
        }
    }

    public ArrayList<Item> ler(){
        try{
            //localizar arquivo
            InputStream is = new FileInputStream("medicamentos.txt");
            //preparar arquivo
            InputStreamReader isr = new InputStreamReader(is) ;
            //ler arquivo
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            ArrayList<String> linhas = new ArrayList<String>();

            while(linha != null){
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

            System.out.println("O arquivo medicamento.txt foi lido com sucesso");

            //transformar as linhas em objetos
            ArrayList<Item> itens = new ArrayList<>();
            Item item; //cria um item especifico para cada linha
            String[] elementos = new String[3];
            /*
            elementos[0] = Dipirona 500mg
            elementos[1] = 100
            elementos[2] = Caixa
            * */

            for(int i = 0; i<linhas.size(); i++){
                elementos = linhas.get(i).split(",");
                int quantidade = Integer.parseInt(elementos[1]);
                item = new Item(elementos[0], quantidade, elementos[2]);
                itens.add(item);
            }
            System.out.println("Linhas convertidas em Objetos com sucesso");
            return itens;
        }catch (Exception e){
            System.out.println("Não conseguiu ler o arquivo");
            return null;
        }
    }
}
