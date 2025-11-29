package Questao5;
public class TesteProd {
    public static void main(String[] args) {

        Produto p1 = new Produto(12345);
        p1.setVolume(50);

        System.out.println("Antes do teste:");
        System.out.println(p1);

        boolean resultado = p1.testaUnidade();

        System.out.println("\nResultado do teste: " + (resultado ? "APROVADO" : "REPROVADO"));
        System.out.println("Depois do teste:");
        System.out.println(p1);

        // Tentativa de testar novamente (não deve deixar)
        System.out.println("\nTentando testar novamente:");
        p1.testaUnidade();
    }
}
