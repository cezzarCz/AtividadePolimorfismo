package com.mycompany.atividadepolimorfismo2;
import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;
    
    //Metodos

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    //Construtor com parametro
    public Carro(String modelo, double preco, double km){
        super(modelo, preco);
        setKm(km);
    }
    //Construtor sem parametro
    public Carro(){
        this("Nulo", 0.0, 0.0);
    }
    //Metodo super classe
    public void inserirDados(){
        Scanner ler = new Scanner(System.in);
        double k;
        super.inserirDados();
        System.out.println("Informe a quilometragem: ");
        k = ler.nextDouble();
        setKm(k);
    }
    public void printDados(){
        System.out.println("Dados do carro:");
        System.out.println("Modelo: "+getModelo()+"\nPreco: "+getPreco()+"\nKm: "+getKm());
    }
            
}
