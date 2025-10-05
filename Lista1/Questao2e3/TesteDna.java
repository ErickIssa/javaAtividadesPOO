package Questao2e3;


public class TesteDna {
    public static void main(String[] args) {
       

        Dna[] dnas = new Dna[2];

        for (int i = 0; i < dnas.length; i++) {
            System.out.println("=== DNA " + (i + 1) + " ===");
            dnas[i] = new Dna();
        }

        for (int i = 0; i < dnas.length; i++) {
            System.out.println(dnas[i].toString());
            
        }

        System.out.println("" + dnas[0].verificaAdenina());

        System.out.println("" + dnas[0].similaridade(dnas[1]));
      
    }
}
