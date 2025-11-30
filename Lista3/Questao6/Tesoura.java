package Questao6;

public class Tesoura implements Objeto{

    @Override
    public String getNome() {
        return "Tesoura";
    }

    @Override
    public int compara(Objeto o) { //instanceOf verifica se um objeto é de uma classe especifica
        if (o instanceof Tesoura) return 0; 
        if (o instanceof Papel) return 1; // Tesoura corta Papel
        if (o instanceof Pedra) return -1; // Pedra quebra Tesoura
        return 0;
    }
    
}
