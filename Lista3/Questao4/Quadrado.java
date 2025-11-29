package Questao4;

import java.util.Scanner;

public class Quadrado  extends Retangulo{

    public Quadrado(float lado) {
        super(lado, lado); // passa lado = altura
    }

    public Quadrado() {
    }

    @Override
    public float calcularArea(){
        return this.getLado() * this.getLado();
    }

    @Override
    public float calcularPerimetro(){
        return (4 * getLado());
    }

    @Override
    public String getTipo(){
        return "quadrado";
    }

    @Override
    public String requisitaDados() {
        return "Lado = " + getLado();
    }

    @Override
    public void requisitaInformacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o lado: ");
        setLado(sc.nextFloat());
    }

    
}
