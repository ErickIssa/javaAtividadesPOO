package javaAtvs.teste;
import java.util.Scanner;

public class contaDias {

    public static int calculaDias(int diaA, int dia,int  mesA,int mes,int anoA,int ano) {
        int diasNasc;
        int diasAtual;

        diasNasc = dia +(mes * 30) + (ano * 360);
        diasAtual = diaA + (mesA * 30) + (anoA * 360);
        
        return diasAtual - diasNasc;
    }
    public static void main(String[] args) {
        int dia, mes, ano;
        int diaA, mesA, anoA;
        int diasTotais;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (DD MM AAAA): ");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
    
        System.out.println("Digite a data atual (DD MM AAAA): ");
        diaA = teclado.nextInt();
        mesA = teclado.nextInt();
        anoA = teclado.nextInt();

        diasTotais = calculaDias(diaA, dia, mesA, mes, anoA, ano);

        System.out.println(diasTotais);

        teclado.close();
    }


}
