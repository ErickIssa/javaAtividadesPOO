package Questao6;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void diminuiEstoque(){
        if(quantidade == 0){
            System.out.println("Sem produto");
        }else{
            quantidade -= 1;
        }
    }

    public void aumentaEstoque(){
        this.quantidade += 1;
    }

    public void aumentaPreco(int valor){
        preco = preco + valor;
    }

    public void diminuiPreco(int valor){
        preco = preco - valor;
    }

    public double getPreco(){
        return preco;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
