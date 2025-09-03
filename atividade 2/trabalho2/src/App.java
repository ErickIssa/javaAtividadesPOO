

public class App {
    public static void main(String[] args) throws Exception {
      Funcionario f1 = new Funcionario("Erick", "19/06/2006", "Estagiário", "Efetivo", 1200, 0, "01/09/2025");
      System.out.println(f1.getNome());
      System.out.println(f1.getDataNasc());
}       
}
