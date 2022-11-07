package com.mycompany.atividadepolimorfismo;
import java.util.Scanner;

public class Dvd extends Midia {
    private int nFaixas;
    
    //Construtor sem parametro
    public Dvd(){
        this(0,0.0,"Vazio",0);
    }
 
    //Construtor com parametro
    public Dvd(int codigo, double preco, String nome, int nFaixas){
        super(codigo, preco, nome);
        setnFaixas(nFaixas);
    }
    //Metodos

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    //Sobrescrita do metodo da superclasse
    public String getTipo(){
        return "DVD: ";
    }
    
    public String getDetalhes(){
        return super.getDetalhes() + "\nNumero de faixas: " +nFaixas;
    }
    
    public void inserirDados(){
        int nFaixas;
        super.inserirDados();
        Scanner ler = new Scanner(System.in);
        System.out.println("\nQuantidade de faixas: ");
        nFaixas = ler.nextInt();
        
        setnFaixas(nFaixas);
    }
}
