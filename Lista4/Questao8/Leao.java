package Questao8;

public class Leao extends Animal{

    public Leao(String nome){
    super(nome); 
        /* NOTA: sintaxe de como usar super, e tambem é necessario 
        construtor da superclasse para usar isso*/ 
    }

    @Override
    public String alimenta(){
        return "Carne e gente";
    }
    
}
