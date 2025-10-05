package Questao6;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private String nome;
    private double valorTotal;
    private ArrayList<Produto> produtos = new ArrayList<>();

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public double calculaPrecoFinal() {
        double valorFinal = 0;
        for (Produto p : produtos) {
            valorFinal += p.getPreco();
        }
        return valorFinal + (valorFinal * 0.10);
    }

    public void finalizarPedido() {
        for (Produto p : produtos) {
            System.out.println("Nome Produto: " + p.getNome());
            p.diminuiEstoque();
        }
        System.out.println("Valor Total: " + this.calculaPrecoFinal());
    }
}