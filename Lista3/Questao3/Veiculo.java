package Questao3;

public abstract class Veiculo {
    protected int numeroRodas; //utilizar protected para as subclasses conseguirem ver os atributos também
    protected float velocidade;
    
    public abstract int getNumeroRodas();

    public abstract void acelerar(float velocidade);

    public abstract void parar();
}
