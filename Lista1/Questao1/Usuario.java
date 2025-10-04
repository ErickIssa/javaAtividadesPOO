package Questao1;

public class Usuario {
    
    public static void main(String[] args) {
        CondicionadorDeAr arCond = new CondicionadorDeAr();
        arCond.setLigado();
        
        for(int i = 0; i < 9; i++){
        arCond.aumentarTemperatura();
        }

        for(int i = 0; i < 14; i++){
        arCond.diminuirTemperatura();
        }

        System.out.println("A temperatura é : " + arCond.getTemperatura() + "°");
    }
}
