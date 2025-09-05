public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Erick Vinicius Issa Silva", "19/06/2006");
        f1.setTipoContrato("Horista");
        f1.setValorSal(200);
        f1.setHorasTrabalhadas(10);
        
        System.out.println(f1.getNome());
        System.out.println(f1.getDataNasc());
        System.out.println(f1.getTipoContrato());
        f1.getFolhaPagamento();

        System.out.println("----------------------------------------------");

        Funcionario f2 = new Funcionario("Labubu da Silva", "03/01/1400");
        f2.setTipoContrato("Efetivo");
        f2.setValorSal(10000);
        f2.setHorasTrabalhadas(10);

        System.out.println(f2.getNome());
        System.out.println(f2.getDataNasc());
        System.out.println(f2.getTipoContrato());
        f2.getFolhaPagamento();

    }       
}
