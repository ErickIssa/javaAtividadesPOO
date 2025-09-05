

public class App {
    public static void main(String[] args) throws Exception {
      Funcionario f1 = new Funcionario("Erick", "19/06/2006");
      f1.setTipoContrato("Horista");
      f1.setValorSal(20);
      System.out.println(f1.getTipoContrato());
      System.out.println(f1.calcSalario(10));

      Data dataSy = new Data();
      dataSy.printData();
}       
}
