package Questao1;
public class CondicionadorDeAr {
    
    private Termostato termostato;
    private boolean status;

    public CondicionadorDeAr(){

        this.termostato = new Termostato();
        this.status = false;
    }

    public void setLigado(){
        this.status = true;
    }

     public void setDesligado(){
        this.status = false;
    }

    public void aumentarTemperatura(){
        if(!status){
            System.out.println("O condicionador está desligado");
            return;
        }

        int tempAtual = termostato.getTemperatura();
        if(tempAtual < 28){
            termostato.setTemperatura((tempAtual)+1);
        }else{
            System.out.println("Temperatura de 28°C máxima");
        }
    }

    public void diminuirTemperatura(){
        if(!status){
            System.out.println("O condicionador está desligado");
            return;
        }

        int tempAtual = termostato.getTemperatura();
        if(tempAtual > 15){
            termostato.setTemperatura((tempAtual)-1);
        }else{
            System.out.println("Temperatura de 15°C mínima");
        }
    }

    public int getTemperatura() {
    if (!this.status) {
        return -1; // ou lançar uma exceção
    }
    return termostato.getTemperatura();
}

}
