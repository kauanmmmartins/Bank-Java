package com.bank.study;

import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("digite seu nome: ");
        String nome = teclado.next();
        if(idade <18){
            System.out.println(nome+" não pode passar,pois sua idade nao é maior q 18 anos");

        }else{
            System.out.println(nome+"pode passar");


        }
        System.out.println(idade>18?"maior de idade":"menor de idade");
        switch (idade){
            case 18:
                System.out.println("");
        }
    }

}