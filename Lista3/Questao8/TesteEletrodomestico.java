package Questao8;

public class TesteEletrodomestico {

    public static void main(String[] args) {
        
        Televisao tv = new Televisao();
        System.out.println(tv.toString());
        tv.ligar();
        System.out.println(tv.toString());
        tv.conectaWifi();
        System.out.println(tv.toString());
        tv.aumentaVolume();
        System.out.println(tv.toString());
        tv.desligar();
        System.out.println(tv.toString());
    }
    
}
