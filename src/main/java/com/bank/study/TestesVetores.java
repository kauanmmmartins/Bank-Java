package com.bank.study;

import java.util.Scanner;

public class TestesVetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] produtos =  new String[10];
        int contador =0;
        while (true){
            System.out.println("1-para adicionar um produto no vetor");
            System.out.println("2- para encontrar um produto no vetor");
            System.out.println("3- para atualizar um produto no vetor");
            System.out.println("4- para remover um produto do vetor");
            System.out.println("5- para listar os produtos do vetor");
            System.out.println("0- para terminar o sistema");
            System.out.println("Digite sua opção: ");
            int opcao = teclado.nextInt();
            if(opcao > 5){
                System.out.println("opção invalida!");
            } else if ( opcao ==1) {
                System.out.println("Digite o nome do produto que deseja adcionar: ");
                String produto = teclado.next();
                produtos[contador] = produto;
                contador++;

            } else if (opcao==2){
                System.out.println("Digite o nome do produto que deseja: ");
                String produtoProcurado = teclado.next();
                boolean encontrado=false;
                for(int i=0; i<produtos.length;i++) {
                    if (produtoProcurado.equals(produtos[i])) {
                        System.out.println("produto encontrado: " + produtoProcurado);
                        encontrado=true;
                    }
                }
                if (!encontrado){
                    System.out.println("Produto nao encontrado");
                }
            } else if (opcao==3){
                System.out.println("Digite nome do produto de deseja atualizar:  ");
                String produtoAtulizar = teclado.next();
                 boolean atualizar = false;
                for (int i=0; i<produtos.length;i++) {
                    if (produtoAtulizar.equals(produtos[i])) {
                        System.out.println("Digite o nome do produto atualizado: ");
                        String produtoAtualizado = teclado.next();
                        produtos[i] = produtoAtualizado;
                        System.out.println("produto atualizado com sucesso");
                        atualizar = false;
                    }

                }
                if (!atualizar){
                    System.out.println("produto não encontrado");
                }
            } else if (opcao==4){
                System.out.println("Digite o nome do produto que deseja remover: ");
                String produtoRemover = teclado.next();
                boolean remover=false;
                for(int i =0; i< produtos.length;i++){
                    if (produtoRemover.equals(produtos[i])){
                        produtos[i] = produtos[contador-1];
                        produtos[contador-1] = null;
                        contador--;
                        remover = true;
                        System.out.println("Produto removido com sucesso");
                    }
                }
                if (!remover){
                    System.out.println("Produto não encontrado");
                }
            } else if (opcao==5){
                for(int i=0;i<produtos.length;i++){
                    String produto = produtos[i];
                    if (produto != null){
                        System.out.println("Produtos:" + produto);
                    }


                }

            } else if (opcao==0) {
                System.out.println("Sistema finalizado");
                break;

            }
        }
    }
}
