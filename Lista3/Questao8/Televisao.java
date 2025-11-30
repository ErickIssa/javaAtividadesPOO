package Questao8;

public class Televisao extends Eletrodomestico implements AparelhoInteligente {

    private int volume;

    
    public Televisao() {
        this.volume = 20;
        super.estado = true;
    }

    public void conectaWifi(){
        System.out.println("Conectando no Wi-Fi");
    }
    public void ligar(){
    this.estado = false;
    }
    public void desligar(){
        this.estado = true;
    }
    public void diminuiVolume(){
        this.volume -= 1;
    }

    public void aumentaVolume(){
        this.volume += 1;
    }

    @Override
    public String toString() {
        return "Televisao [nome=" + nome + ", estado=" + estado + ", volume=" + volume + ", toString()=" + "]";
    }

    
}
