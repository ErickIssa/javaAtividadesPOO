

public class App {
    public static void main(String[] args) throws Exception {
      Funcionario f1 = new Funcionario("Erick", "19/06/2006");
      f1.setTipoContrato("Horista");
      f1.setValorSal(200);
      

      int horasTra = 10;
      System.out.println(f1.getTipoContrato());
      System.out.println(f1.calcSalarioBruto(horasTra));
      System.out.println(f1.calcularDescontoINSS(f1.calcSalarioBruto(horasTra)));
      System.out.println(f1.calcularIRRF(f1.calcSalarioBruto(horasTra)));
      
      System.out.println(f1.getSalarioDescontado(horasTra));

      Data dataSy = new Data();
      dataSy.printData();
      System.out.println(dataSy.calculaDiffDias(05, 9, 2024));
}       
}
