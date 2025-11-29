package Questao4;

import java.util.Scanner;

public class Retangulo extends Forma {

    private float altura;
    private float lado;

    
    
    public Retangulo() {
    }



    public Retangulo(float altura, float lado) {
        this.altura = altura;
        this.lado = lado;
    }


    
    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }



    public float getLado() {
        return lado;
    }



    public void setLado(float lado) {
        this.lado = lado;
    }



    @Override
    public float calcularArea(){
        return this.altura * this.lado;
    }

    @Override
    public float calcularPerimetro(){
        return (2*altura) + (2*lado);
    }

    @Override
    public String getTipo(){
        return "Retangulo";
    }

    @Override
    public String requisitaDados() {
        return "Lado = " + lado + ", Altura = " + altura;
    }

    @Override
    public void requisitaInformacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o lado: ");
        lado = sc.nextFloat();
        System.out.print("Informe a altura: ");
        altura = sc.nextFloat();
    }

    
}
