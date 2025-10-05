package Questao6;
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PRIMEIRO PRODUTO ===");
        System.out.print("Digite o nome do produto: ");
        String nome1 = scanner.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double preco1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Digite a marca da etiqueta: ");
        String marca1 = scanner.nextLine();
        
        System.out.print("Digite o tamanho da etiqueta: ");
        String tamanho1 = scanner.nextLine();
        
        Etiqueta etiqueta1 = new Etiqueta(marca1, tamanho1);
        Produto produto1 = new Produto(nome1, preco1, etiqueta1);
        
        System.out.println("\n--- Primeiro produto criado ---");
        System.out.println(produto1.toString());
        
        System.out.println("\n=== SEGUNDO PRODUTO ===");
        System.out.print("Digite o nome do produto: ");
        String nome2 = scanner.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double preco2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Digite a marca da etiqueta: ");
        String marca2 = scanner.nextLine();
        
        System.out.print("Digite o tamanho da etiqueta: ");
        String tamanho2 = scanner.nextLine();
        
        Produto produto2 = new Produto(nome2, preco2, marca2, tamanho2);
        
        System.out.println("\n--- Segundo produto criado ---");
        System.out.println(produto2.toString());
        
        System.out.println("\n=== ALTERANDO ATRIBUTOS DO PRIMEIRO PRODUTO ===");
        System.out.print("Digite o novo nome para o primeiro produto: ");
        String novoNome = scanner.nextLine();
        produto1.setNome(novoNome);
        
        System.out.print("Digite o novo preço para o primeiro produto: ");
        double novoPreco = scanner.nextDouble();
        produto1.setPreco(novoPreco);
        scanner.nextLine();
        
        System.out.print("Digite a nova marca da etiqueta: ");
        String novaMarca = scanner.nextLine();
        
        System.out.print("Digite o novo tamanho da etiqueta: ");
        String novoTamanho = scanner.nextLine();
        
        Etiqueta novaEtiqueta = new Etiqueta(novaMarca, novoTamanho);
        produto1.setEtiqueta(novaEtiqueta);
        
        System.out.println("\n--- Primeiro produto após alterações ---");
        System.out.println(produto1.toString());
        
        System.out.println("\n--- Segundo produto (sem alterações) ---");
        System.out.println(produto2.toString());
        
        scanner.close();
    }
}