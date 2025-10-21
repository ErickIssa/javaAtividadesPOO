package Lista2.Questao9;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        cliente.setGenero("Masculino");
        cliente.setIdade(30);
        cliente.setAltura(1.75);
        cliente.setPeso(80);
        cliente.setId(101);
        cliente.cadastrar("CAD123");

        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cadastrado: " + cliente.isEstaCadastrado());

        Paciente paciente = new Paciente();
        paciente.setNome("Maria");
        paciente.setGenero("Feminino");
        paciente.setIdade(25);
        paciente.setAltura(1.68);
        paciente.setPeso(60);
        paciente.setId(202);
        paciente.cadastrar("PAC456");

        System.out.println("\n=== Dados do Paciente ===");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("IMC: " + paciente.calculaIMC());
        System.out.println("Cadastrado: " + paciente.isEstaCadastrado());
    }
}
