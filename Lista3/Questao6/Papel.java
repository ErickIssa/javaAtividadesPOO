package Questao6;

public class Papel implements Objeto {

     @Override
    public String getNome() {
        return "Papel";
    }

    @Override
    public int compara(Objeto o) {
        if (o instanceof Papel) return 0;
        if (o instanceof Pedra) return 1; // Papel envolve Pedra
        if (o instanceof Tesoura) return -1; // Tesoura corta Papel
        return 0;
    }
    
}
