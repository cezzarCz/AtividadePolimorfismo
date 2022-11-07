package com.mycompany.atividadepolimorfismo;
import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    //Construtor sem parametro
    public Midia(){
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "Vazio";
    }
    
    //Construtor com parametro
    public Midia(int codigo, double preco, String nome){
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
    }
    //Metodos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo(){
        return "Midia: ";
    }

    public String getDetalhes(){
        String detalhes;
        detalhes = "\nCodigo: "+getCodigo()+" Nome: "+getNome()+" Preco: "+getPreco();
        
        return detalhes;
    }
    public void printDados(){
        System.out.println("Tipo de midia: "+getTipo()+"\n Detalhes da midia: "+getDetalhes());
    }
    
    //Obtendo dados do usuario
    public void inserirDados(){
        int cod;
        double pre;
        String nom;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Cadastro de dados:");
        System.out.println("\nCodigo: ");
        cod = ler.nextInt();
        System.out.println("\nPreco: ");
        pre = ler.nextDouble();
        ler.nextLine();
        System.out.println("\nNome: ");
        nom = ler.nextLine();
   
        setCodigo(cod);
        setPreco(pre);
        setNome(nom);
    }
}
