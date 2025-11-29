package Questao1;
public abstract class Animal{ //Uma classe abstrata é uma classe que não pode ser instanciada diretamente.
    //Ela serve como modelo/base para outras classes que a herdam.
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}

