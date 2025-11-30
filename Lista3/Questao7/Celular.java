package Questao7;

public class Celular extends DispositivoEletronico implements Recarregavel{

    private int bateria;

    @Override
    public void ligar(){
        this.status = true;
    }

    @Override
    public void desligar(){
        this.status = false;
    }

    @Override
    public void recarregar(){
        this.bateria = 100;
    }
    

}
