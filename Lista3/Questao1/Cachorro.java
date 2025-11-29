package Questao1;

public class Cachorro extends Animal{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro [getRaca()=" + getRaca() + ", getNome()=" + getNome() + ", getPeso()=" + getPeso() + "]";
    }

    
}
