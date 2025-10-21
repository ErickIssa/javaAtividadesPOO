package Lista2.Questao5;

public class Automovel {
    private String modelo;
    private int ano;
    private double quilometragem;
    private double combustivel;
    private double kmPorLitro;

    public Automovel(String modelo, int ano, double quilometragem, double combustivel, double kmPorLitro) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
        this.kmPorLitro = kmPorLitro;
    }

   
    public void abastecer(double litros) {
        combustivel += litros;
        System.out.printf("%.2f litros abastecidos. Combustível atual: %.2f L%n", litros, combustivel);
    }

    
    public void trafegar(double distancia) {
        double consumo = distancia / kmPorLitro;

        if (consumo > combustivel) {
            System.out.println("Combustível insuficiente para percorrer essa distância!");
        } else {
            quilometragem += distancia;
            combustivel -= consumo;
            System.out.printf("Viagem concluída! Quilometragem atual: %.2f km%n", quilometragem);
            System.out.printf("Combustível restante: %.2f L%n", combustivel);
        }
    }

    
    public double combustivelNoTanque() {
        return combustivel;
    }

   
    public double quilometragemCarro() {
        return quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
