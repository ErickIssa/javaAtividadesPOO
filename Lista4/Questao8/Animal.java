package Questao8;

public abstract class Animal{

    protected String nome;

    
    public Animal(String nome) {
        this.nome = nome;
    }


    public abstract String alimenta();

}