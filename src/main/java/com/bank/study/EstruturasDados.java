package com.bank.study;

import java.util.Scanner;

public class EstruturasDados {
    public static void main(String[] args) {
        String[] produtos = new String[10];
        Scanner teclado = new Scanner(System.in);
        produtos[0] ="TV";
        produtos[1] = "Controle de TV";
        for ( int i=0; i< produtos.length; i++){
            if (produtos[i]!= null){
                String produto = produtos[i];
                System.out.println(produto);
            }
        }

        for ( int i = 0;i < produtos.length; i++){
            if (produtos[i] == null){
                System.out.println("Digite um produto: ");
                String produto = teclado.next();
                produtos[i] = produto;
                break;
            }
        }
        produtos[1] = null;
        for(int i = 0; i< produtos.length; i++){
            String produto = produtos[i];
            System.out.println("produtos do array: " + produto);
        }

    }
}
