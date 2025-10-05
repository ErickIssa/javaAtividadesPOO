package br.ufv.universidade;

public class Disciplina {
    private String nome;
    private boolean pratica;


    public Disciplina(String nome, boolean pratica) {
        this.nome = nome;
        this.pratica = pratica;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public boolean isPratica() {
        return pratica;
    }

     public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    public String toString() {
        return "Disciplina: " + nome + ", Pratica: " + pratica;
    }


}
