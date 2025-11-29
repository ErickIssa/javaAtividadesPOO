package Questao2;

public class TestaCalculadora {
    public static void main(String[] args) {

        // Calculadora comum
        Calculadora calc = new Calculadora();
        System.out.println("=== Calculadora Básica ===");
        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.subtracao(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));
        System.out.println("Divisão: " + calc.divisao(10, 5));

        // Calculadora científica
        CalculadoraCientifica calcC = new CalculadoraCientifica();
        System.out.println("\n=== Calculadora Científica ===");
        System.out.println("Raiz Quadrada de 16: " + calcC.raizQuadrada(16));
        System.out.println("2 elevado a 8: " + calcC.potencia(2, 8));
        System.out.println("Divisão: " + calcC.divisao(10, 5));
    }
}
