import java.time.LocalDate;

public class Data{

    private int dia;
    private int mes;
    private int ano;

    public Data(){
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();  
        this.ano = dataAtual.getYear();
    }

      
    public String getDataFormatada() {
        
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public void printData() {
        System.out.println(getDataFormatada());
    }

 public int calculaDiffDias(int diaA, int mesA, int anoA) {
        int diasAtual = this.dia + (this.mes * 30) + (this.ano * 360);
        int diasAdd = diaA + (mesA * 30) + (anoA * 360);
        
        return diasAtual - diasAdd;
    }
}