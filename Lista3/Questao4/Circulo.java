package Questao4;
import java.lang.Math;
import java.util.Scanner;

public class Circulo extends Forma{
    
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    
    public Circulo() {
    }


    @Override
    public float calcularArea(){
        return (float)(Math.PI * this.raio * this.raio);
    }

    @Override
    public float calcularPerimetro(){
        return (float)(2 *Math.PI * this.raio);
    }

    @Override
    public String getTipo(){
        return "Circuferência";
    }

    @Override
    public String requisitaDados() {
        return "Raio = " + raio;
    }

    @Override
    public void requisitaInformacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        raio = sc.nextFloat();
        
    }
}
