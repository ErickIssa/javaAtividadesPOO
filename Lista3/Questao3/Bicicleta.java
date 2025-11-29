package Questao3;

public class Bicicleta extends Veiculo {

    public int getNumeroRodas(){
        return 2;
    }

    public void acelerar(float velocidade){
        this.velocidade = velocidade;
    }

    public void parar(){
        this.velocidade = 0;
    }
    
}
