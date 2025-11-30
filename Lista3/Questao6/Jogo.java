package Questao6;
import java.util.Random;

public class Jogo {

    private static Objeto sorteia() {
        Random r = new Random();
        int n = r.nextInt(3);

        if (n == 0) return new Pedra();
        if (n == 1) return new Papel();
        return new Tesoura();
    }

    public static void main(String[] args) {

        while (true) {
            Objeto o1 = sorteia();
            Objeto o2 = sorteia();

            System.out.println("Jogador 1: " + o1.getNome());
            System.out.println("Jogador 2: " + o2.getNome());

            int resultado = o1.compara(o2);

            if (resultado == 0) {
                System.out.println("Resultado: Empate!\n");
            } else if (resultado == 1) {
                System.out.println("Resultado: Jogador 1 venceu!\n");
            } else {
                System.out.println("Resultado: Jogador 2 venceu!\n");
            }

            try {
                Thread.sleep(1000); // pausa para não imprimir rápido demais
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
