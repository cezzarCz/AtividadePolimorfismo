package com.mycompany.atividadepolimorfismo;
import java.util.Scanner;

public class Cd extends Midia {
    private int nMusicas;
    
    
    //Construtor sem parametro
    public Cd(){
        this(0,0.0,"Vazio",0);
    }
    //Construtor com parametro
    public Cd(int codigo, double preco, String nome, int nMusicas){
        super(codigo, preco, nome);
    }
    //Metodos

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    public String getTipo(){
        return "CD: ";
    }
    public String getDetalhes(){
        return super.getDetalhes()+"\nNumero de musicas: "+nMusicas;
    }
    public void inserirDados(){
        int nMus;
        super.inserirDados();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de musicas: ");
        nMus = ler.nextInt();
        
        setnMusicas(nMus);
    }
}
