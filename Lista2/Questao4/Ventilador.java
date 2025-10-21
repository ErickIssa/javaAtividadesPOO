package Lista2.Questao4;

public class Ventilador {
    private int velocidade;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Ventilador(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
        velocidade = 0;
    }

    public void aumentarVelocidade() {
        if (ligado && velocidade < 3) {
            velocidade++;
        }
    }

    public void diminuirVelocidade() {
        if (ligado && velocidade > 0) {
            velocidade--;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String toString() {
        return "Modelo: " + modelo +
               "\nAno: " + ano +
               "\nLigado: " + (ligado ? "Sim" : "Não") +
               "\nVelocidade: " + velocidade;
    }

    public static void main(String[] args) {
        Ventilador v = new Ventilador("Arno Turbo", 2023);
        v.ligar();
        v.aumentarVelocidade();
        v.aumentarVelocidade();
        System.out.println(v.toString());
    }
}
