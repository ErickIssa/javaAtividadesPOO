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
}