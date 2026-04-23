package com.bank.study;

import java.util.ArrayList;
import java.util.List;

public class Repeticao {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("numeros: "+i);

        }
        List<String> nomes = new ArrayList<>();
        nomes.add("kauan");
        nomes.add("joão");
        nomes.add("andre");
        nomes.add("gabriel");
        nomes.add("luiz");
        for(int i=0;i<nomes.size();i++){
            String nome = nomes.get(i);
            System.out.println("Nomes: "+nome);
        }
        for(String nome:nomes){
            System.out.println(nome);

        }
        nomes.forEach(nome -> {
            System.out.println(nome);
        });
         int i = 0;
        while (i<3){
            System.out.println("numero: "+i);
            i++;


        }
        do {
            System.out.println("numero: "+i);
            i++;
        } while (i<6);


    }

}
