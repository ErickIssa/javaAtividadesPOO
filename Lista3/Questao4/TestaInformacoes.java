package Questao4;

import java.util.Scanner;

public class TestaInformacoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Forma forma = null;

        System.out.println("Escolha a forma:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Círculo");
        System.out.println("3 - Quadrado");
        System.out.print("Opção: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                forma = new Retangulo();
                break;
            case 2:
                forma = new Circulo();
                break;
            case 3:
                forma = new Quadrado();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        // Solicita dados específicos da figura
        forma.requisitaInformacoes();

        // Exibe resultados
        System.out.println("\n--- Resultado ---");
        System.out.println("Tipo: " + forma.getTipo());
        System.out.println("Área: " + forma.calcularArea());
        System.out.println("Perímetro: " + forma.calcularPerimetro());
    }
}
