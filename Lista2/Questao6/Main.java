package Questao6;

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setPreco(2500.00);
        produto1.setQuantidade(10);
        
        Produto produto2 = new Produto();
        produto2.setNome("Mouse");
        produto2.setPreco(50.00);
        produto2.setQuantidade(20);
        
        
        Pedido pedido = new Pedido();
        pedido.setId(1);
        pedido.setNome("Pedido Teste");
        
        
        pedido.adicionaProduto(produto1);
        pedido.adicionaProduto(produto2);
        
        
        double valorCompra = pedido.calculaPrecoFinal();
        System.out.println("Valor da compra (com 10% de taxa): R$ " + valorCompra);
        
        
        System.out.println("\n--- FINALIZANDO PEDIDO ---");
        pedido.finalizarPedido();
        
        
        System.out.println("\n--- ESTOQUE APÓS VENDA ---");
        System.out.println("Estoque do " + produto1.getNome() + ": " + produto1.getQuantidade());
        System.out.println("Estoque do " + produto2.getNome() + ": " + produto2.getQuantidade());
        
        System.out.println("\n--- INFORMAÇÕES DO PEDIDO ---");
        System.out.println("ID do Pedido: " + pedido.getId());
        System.out.println("Nome do Pedido: " + pedido.getNome());
        System.out.println("Quantidade de produtos no pedido: " + pedido.getProdutos().size());
        pedido.finalizarPedido();
    }
}