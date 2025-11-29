package Questao8;

public class Elefante extends Animal {

    public Elefante(String nome){
    super(nome); 
        /* NOTA: sintaxe de como usar super, e tambem é necessario 
        construtor da superclasse para usar isso*/ 
    }

    @Override
    public String alimenta(){
        return "Copao de 10 do The Portas";
    }
    
}
