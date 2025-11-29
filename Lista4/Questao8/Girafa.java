package Questao8;

public class Girafa extends Animal{

    public Girafa(String nome){
        super(nome); 
        /* NOTA: sintaxe de como usar super, e tambem é necessario 
        construtor da superclasse para usar isso*/ 
    }
    
    @Override
    public String alimenta(){
        return "Folhas de Árvore";
    }
    
}
