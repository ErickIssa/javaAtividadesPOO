package Questao7;

public class TestaEmpresa {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(1, "Carlos", "TI", 50);
        Gerente g1 = new Gerente(2, "Maria", "Administração", 80, 10);

        System.out.println("Salário funcionário (160h): " + f1.calculaSalario());
        System.out.println("Salário funcionário (180h): " + f1.calculaSalario(180));

        System.out.println("Salário gerente (160h + 40%): " + g1.calculaSalario());
        System.out.println("Salário gerente (180h + 40%): " + g1.calculaSalario(180));
    }
}
