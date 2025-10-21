package Lista2.Questao9;

public class Paciente extends Cliente {


    @Override
    public void cadastrar(String cadastro) {
        super.cadastrar(cadastro);
        System.out.println("Paciente sendo cadastrado...");
    }

    public double calculaIMC() {
        double altura = getAltura();
        double peso = getPeso();
        if (altura > 0) {
            return peso / (altura * altura);
        } else {
            System.out.println("Altura inválida para cálculo do IMC!");
            return 0;
        }
    }
}

