package com.mycompany.atividadepolimorfismo2;
import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;
    
    //Metodos

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //Construtor com parametro
    public Moto(String modelo, double preco, int ano){
        super(modelo, preco);
        setAno(ano);
    }
    //Construtor sem parametro
    public Moto(){
        this("Nulo",0.0,0);
    }
    //Metodo da super classe
    public void inserirDados(){
        Scanner ler = new Scanner(System.in);
        int an;
        super.inserirDados();
        System.out.println("Informe o ano da moto: ");
        an = ler.nextInt();
        setAno(an);
    }
    
    public void printDados(){
        System.out.println("Dados da moto:");
        System.out.println("Modelo: "+getModelo()+"\nPreco: "+getPreco()+"\nAno: "+getAno());
    }
    
    /*public double verificaAno(){
        int an;
        an = getAno();
        if(an <= 2008){
         
        }
    }*/
    
}
