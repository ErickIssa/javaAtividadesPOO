package Questao5;
import java.util.Random;
import java.util.random.*;

public class Produto {

    private int nmrSerial;
    private int volume;
    private String teste;
    private boolean jaTestado;
    
    public Produto(int nmrSerial) {
        this.nmrSerial = nmrSerial;
        this.teste = "Não testado";
        this.jaTestado = false;
    }

    public boolean testaUnidade() {
        if (jaTestado) {
            System.out.println("Erro: O produto já foi testado!");
            return  teste.equals("aprovado");
        }

        jaTestado = true;

        double chance = Math.random(); // 0.0 até <1.0

        if (chance < 0.9) { // 90% de chance de ser aprovado
            teste = "aprovado";
            return true;
        } else {
            teste = "reprovado";
            return false;
        }
    }

    public int getNmrSerial() {
        return nmrSerial;
    }

    public void setNmrSerial(int nmrSerial) {
        this.nmrSerial = nmrSerial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "Produto [nmrSerial=" + nmrSerial + ", volume=" + volume + ", teste=" + teste + "]";
    }

    
    
    
}
