package Questao1;

public class Peixe extends Animal {
    private String tipoHabitat;

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Peixe [getTipoHabitat()=" + getTipoHabitat() + ", getNome()=" + getNome() + ", getPeso()=" + getPeso()
                + "]";
    }

    
}


