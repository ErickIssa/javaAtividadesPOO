package Questao1;

public class TestaAnimal {
    public static void main(String[] args) {

        // Criando um cachorro
        Cachorro c = new Cachorro();
        c.setNome("Rex");
        c.setPeso(12.5);
        c.setRaca("Labrador");

        // Criando um peixe
        Peixe p = new Peixe();
        p.setNome("Dourado");
        p.setPeso(0.35);
        p.setTipoHabitat("Água doce");

        // Imprimindo usando toString()
        System.out.println(c.toString());
        System.out.println(p.toString());
    }
}
