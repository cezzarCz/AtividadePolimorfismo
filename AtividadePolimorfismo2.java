package com.mycompany.atividadepolimorfismo2;

import java.util.Scanner;

public class AtividadePolimorfismo2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        Veiculo[] cadVeiculo = new Veiculo[10];

        for (int i = 1; i < 6; i++) {
            do {
                System.out.println("-----Cadastro de veiculos-----");
                System.out.println("1 - Carro || 2 - Moto");
                System.out.println("Opcao: ");
                op = ler.nextInt();

                if (op != 1 && op != 2) {
                    System.out.println("Opcao invalida! Tente novamente...\n");
                } else {
                    if (op == 1) {
                        System.out.println("Cadastro do veiculo "+ i);
                        cadVeiculo[i] = new Carro();
                    } else {
                        System.out.println("Cadastro do veiculo " + i);
                        cadVeiculo[i] = new Moto();
                    }
                    cadVeiculo[i].inserirDados();
                }
            } while(op != 1 && op != 2);
        }
        System.out.println("-----Relatorio de veiculos-----");
        for (int i = 1; i < 6; i++){
            System.out.println("Veiculo "+i);
            cadVeiculo[i].printDados();
            System.out.println("\n");
        }
        System.out.println("-----Levantamento-----");
        double totalPreco = 0;
        for (int i = 1; i < 6; i++){
            totalPreco = totalPreco + cadVeiculo[i].getPreco();
        }
        System.out.println("Preco total dos veiculos: "+totalPreco);
        

    }
}
