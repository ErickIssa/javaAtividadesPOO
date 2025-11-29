import java.util.*;

public class Controller {
    
    Random random = new Random();
    int resposta;
    int tenta;
    Scanner sc1 = new Scanner(System.in);
    CalculatorView view;
    

    public Controller(){
        resposta = random.nextInt(100);
    }
    

    public void Jogo(){
        int i = 0;
        System.out.println(resposta);
        do{
            System.out.println("Digita um numero ai sô:");
            this.tenta = sc1.nextInt();
            i++;
            if(tenta == resposta){
                System.out.println("Acertou!");
                return;
            } else if(tenta < resposta){
                System.out.println("É menor");

            }else if(tenta > resposta){
                System.out.println("E maior");
            }
        }while(tenta != resposta);


    }
}
