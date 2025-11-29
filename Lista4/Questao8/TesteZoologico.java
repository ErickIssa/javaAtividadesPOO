package Questao8;

public class TesteZoologico {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        // Criando animais
        Animal g1 = new Girafa("Melman");
        Animal g2 = new Girafa("Altinha");

        Animal l1 = new Leao("Simba");
        Animal l2 = new Leao("Mufasa");

        Animal e1 = new Elefante("Dumbo");
        Animal e2 = new Elefante("Babar");

        // Adicionando ao zoológico
        zoo.adicionaAnimal(g1);
        zoo.adicionaAnimal(g2);
        zoo.adicionaAnimal(l1);
        zoo.adicionaAnimal(l2);
        zoo.adicionaAnimal(e1);
        zoo.adicionaAnimal(e2);

        // Alimentando todos
        zoo.alimentaAnimais();
    }
}
