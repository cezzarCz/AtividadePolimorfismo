package com.mycompany.atividadepolimorfismo2;
import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private double preco;
    
    //Metodos

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void printDados(){
        System.out.println("Dados do veiculo:");
        System.out.println("Modelo: "+getModelo()+"\nPreco: "+getPreco());
    }
    
    //Construtor com parametro
    public Veiculo(String modelo, double preco){
        setModelo(modelo);
        setPreco(preco);
    }
    
    //Construtor sem parametro
    public Veiculo(){
        this("Nulo",0.0);
    }
    
    //Metodos para receber do usuario
    public void inserirDados(){
        String mod;
        double pre;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o modelo: ");
        mod = ler.nextLine();
        System.out.println("Informe o preco: ");
        pre = ler.nextDouble();
        setModelo(mod);
        setPreco(pre);
    }
}   
