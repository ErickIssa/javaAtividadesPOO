package Questao2;
import java.util.Scanner;

public class Dna {
    private char[] sequencia;
    
    
    public Dna(){
        this.sequencia = new char[9];
        lerDna();
    }

    public void lerDna(){
          Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as 9 bases do DNA (uma por vez, use A, C, G ou T):");
        
        for(int i = 0; i < 9; i++) {
            System.out.print("Base " + (i + 1) + ": ");
            String input = scanner.nextLine().toUpperCase();
            
            if (input.length() != 1 || !"ACGT".contains(input)) {
                System.out.println("Caractere inválido! Use apenas A, C, G ou T.");
                continue;
            }
            
            sequencia[i] = input.charAt(0);
        }
    }

    public char[] getSequencia() {
        return sequencia;
    }

    public void setSequencia(char[] sequenciaRec){
        this.sequencia = sequenciaRec;
    }

    public String toString() {
        return new String(sequencia);
    }

    public int obterFrequencia(char base){
        base = Character.toUpperCase(base);
        int count = 0;
        for(char c : sequencia){
            if (c == base) {
                count++;
            }
        }
        return count;
    }

    public boolean verificaAdenina(){
        int count = 0;
        for(char c : sequencia){
            if (c == 'A') {
                count++;
            }
        }
        if(count > 2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}


