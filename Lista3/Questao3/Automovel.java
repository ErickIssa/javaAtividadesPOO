package Questao3;

public class Automovel extends Veiculo {
    
    public int getNumeroRodas(){
        return 4;
    }

    public void acelerar(float velocidade){
        this.velocidade = velocidade;
    }

    public void parar(){
        this.velocidade = 0;
    }
}
