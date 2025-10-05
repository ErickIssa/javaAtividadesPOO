package Questao5;

public class TesteTexto {
    public static void main(String[] args) {
        System.out.println("=== TESTE DA CLASSE TEXTO ===\n");
        
        // Teste contar vogais
        System.out.println("Contar Vogais:");
        System.out.println("'Programação' tem " + Texto.contarVogais("Programação") + " vogais");
        System.out.println("'Java' tem " + Texto.contarVogais("Java") + " vogais\n");
        
        // Teste conjugar verbo
        System.out.println("2. Conjugar Verbo 'falar':");
        System.out.println(Texto.conjugarVerbo("falar"));
        System.out.println();
        
        // Teste obter inverso
        System.out.println("3. Obter Inverso:");
        System.out.println("   Inverso de 'Java': " + Texto.obterInverso("Java"));
        System.out.println("   Inverso de '12345': " + Texto.obterInverso("12345") + "\n");
        
        // Teste palíndromo
        System.out.println("4. Verificar Palíndromo:");
        System.out.println("   'arara' é palíndromo? " + Texto.isPalindrome("arara"));
        System.out.println("   'Java' é palíndromo? " + Texto.isPalindrome("Java"));
        System.out.println("   'A base do teto desaba' é palíndromo? " + 
                          Texto.isPalindrome("A base do teto desaba"));
        System.out.println("   '12321' é palíndromo? " + Texto.isPalindrome("12321"));
    }
}