package Questao7;

public class Gerente extends Funcionario{

    private int quantidadeDeSubordinados;

    public Gerente(int id, String nome, String alocacao, double valorHora, int quantidadeDeSubordinados) {
        super(id, nome, alocacao, valorHora);
        this.quantidadeDeSubordinados = quantidadeDeSubordinados;
    }

    public Gerente(int quantidadeDeSubordinados) {
        this.quantidadeDeSubordinados = quantidadeDeSubordinados;
    }

    //IMPORTANTE! REVISAR ISSO DPS, pegar um metodo da classe pai e calcular algo apartir dela pra incrementar

    @Override
    public double calculaSalario() {
        double salarioBase = super.calculaSalario();
        return salarioBase * 1.40; // bônus de 40%
    }

    @Override
    public double calculaSalario(double horas) {
        double salarioBase = super.calculaSalario(horas);
        return salarioBase * 1.40; // bônus também ao calcular por horas
    }
}
