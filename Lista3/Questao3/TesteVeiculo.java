package Questao3;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo v1 = new Bicicleta();
        Veiculo v2 = new Automovel();

        System.out.println("Bicicleta: " + v1.getNumeroRodas() + " rodas");
        v1.acelerar(15);
        v1.parar();

        System.out.println();

        System.out.println("Automóvel: " + v2.getNumeroRodas() + " rodas");
        v2.acelerar(80);
        v2.parar();
    }
}
