package com.mycompany.atividadepolimorfismo;
import java.util.Scanner;

public class AtividadePolimorfismo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        
        do{
          System.out.println("Cadastro de midia:");
          System.out.println("1 - DVD | 2 - CD: | 0 - Sair");
          op = ler.nextInt();
            if(op == 1){
                Midia m1 = new Dvd();
                m1.inserirDados();
                m1.printDados();
            } else {
                if(op == 2){
                    Midia m1 = new Cd();
                    m1.inserirDados();
                    m1.printDados();
                } else {
                    if (op == 0) {
                        break;
                    } else {
                        System.out.println("Opcao invalida!");
                    }
                }
            }  
        }while(op != 1 || op != 2 || op != 0);
        
    }
}
