package Questao4;
import java.util.*;

public class TestaFormas {

    public static void main(String[] args) {

    Circulo circulo1 = new Circulo(10);
    Quadrado quadrado1 = new Quadrado(15);
    Retangulo retangulo1 = new Retangulo(5,100);
        
    ArrayList<Forma> vetor = new ArrayList<>();

    vetor.add(quadrado1);
    vetor.add(circulo1);
    vetor.add(retangulo1);

    for(int i = 0; i < vetor.size(); i++){
        System.out.println(vetor.get(i).getTipo() + " Area:"+ vetor.get(i).calcularArea() + " Perimetro:" + vetor.get(i).calcularPerimetro());//lembrar da sixtaxe de arraylist aqui
        
    }
    
}
}
