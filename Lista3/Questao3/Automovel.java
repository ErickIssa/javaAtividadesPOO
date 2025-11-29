package Questao3;
import java.time.LocalDate;

public class Automovel extends Veiculo {

    private LocalDate dataOleo;
    
    public int getNumeroRodas(){
        return 4;
    }

    public void acelerar(float velocidade){
        this.velocidade = velocidade;
    }

    public void parar(){
        this.velocidade = 0;
    }

    public void trocarOleo() {
        this.dataOleo = LocalDate.now();
        System.out.println("Troca de óleo realizada! Nova data: " + dataOleo);
    }

    public LocalDate getDataUltimaTrocaOleo() {
        return dataOleo;
    }
}
