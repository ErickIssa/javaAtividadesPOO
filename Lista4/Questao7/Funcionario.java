package Questao7;

public class Funcionario {

    protected int id;
    protected String nome;
    protected String alocacao;
    protected double valorHora;
    
    public Funcionario(int id, String nome, String alocacao, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.alocacao = alocacao;
        this.valorHora = valorHora;
    }

    public Funcionario() {
    }

    public double calculaSalario(double horas){
        return this.valorHora * horas;
    }

    public double calculaSalario(){
    return this.valorHora * 160;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}
