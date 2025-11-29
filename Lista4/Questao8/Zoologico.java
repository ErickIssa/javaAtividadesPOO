package Questao8;
import java.util.*;

public class Zoologico {
    ArrayList<Animal> vetorAnimal = new ArrayList<>();

    
    public void alimentaAnimais(){
        for(Animal ani : vetorAnimal){
            System.out.println( ani.nome +" se alimenta com: " + ani.alimenta());
        }
    }

    public void adicionaAnimal(Animal a) {
        vetorAnimal.add(a);
    }
}
