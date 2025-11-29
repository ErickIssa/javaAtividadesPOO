import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioExcecoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            // --------------------------
            // LEITURA DO N
            // --------------------------
            System.out.print("Digite um número inteiro N: ");
            int N = Integer.parseInt(scanner.nextLine());   // pode lançar NumberFormatException

            if (N <= 0) {
                throw new IllegalArgumentException("N deve ser positivo.");
            }

            int[] numeros = new int[N];

            // --------------------------
            // LEITURA DOS N NÚMEROS
            // --------------------------
            for (int i = 0; i < N; i++) {
                System.out.print("Digite o " + (i + 1) + "º número (0 a 100): ");

                int valor = Integer.parseInt(scanner.nextLine()); // NumberFormatException

                if (valor < 0 || valor > 100) {
                    throw new IllegalArgumentException("Número fora do intervalo permitido (0–100).");
                }

                numeros[i] = valor;  // ArrayIndexOutOfBoundsException (se i der problema)
            }

            // --------------------------
            // CÁLCULO DA MÉDIA
            // --------------------------
            double soma = 0;
            for (int num : numeros) {
                soma += num;
            }

            double media = soma / N;   // pode gerar ArithmeticException

            // --------------------------
            // AVALIAÇÃO DA MÉDIA
            // --------------------------
            if (media < 60) {
                throw new MediaInsuficiente("Média muito baixa: " + media);
            }

            System.out.println("Média: " + media);

        // ============================================================
        // AQUI FICAM TODOS OS TRATAMENTOS
        // ============================================================

        } catch (NumberFormatException e) {
            System.out.println("Erro: você digitou algo que não é número inteiro.");
            System.out.println("Reiniciando...");
            main(null);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro de valor inválido: " + e.getMessage());
            System.out.println("Reiniciando...");
            main(null);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: acesso indevido ao array.");
            System.out.println("Reiniciando...");
            main(null);

        } catch (ArithmeticException e) {
            System.out.println("Erro ao calcular média (divisão por zero).");
            System.out.println("Assumindo média = 0 e continuando o programa...");
            // Não precisa reiniciar, apenas continua.

        } catch (MediaInsuficiente e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
