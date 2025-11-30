package Questao6;
public class Pedra implements Objeto {

    @Override
    public String getNome(){
        return "Pedra";
    }

    @Override
    public int compara(Objeto o){
        if (o instanceof Pedra) return 0;
        if (o instanceof Tesoura) return 1; // Pedra quebra Tesoura
        if (o instanceof Papel) return -1; // Papel envolve Pedra
        return 0;
    }
    
}
