package com.bank.user;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true){
            System.out.println("### Menu ###");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionario");
            System.out.println("3. Tipos de Conta");
            System.out.println("0. Sair");
            System.out.println("Escolha um:");
            int opcao = teclado.nextInt();
            try {
                int escolha = 0;
                switch (teclado){
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    case 1:

                }

            }


        }
    }
}
