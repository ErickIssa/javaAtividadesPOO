package Questao2;
import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double x) {
        return Math.sqrt(x);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
