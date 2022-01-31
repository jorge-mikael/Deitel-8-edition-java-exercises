import java.security.SecureRandom;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int resposta_aluno;
        int resposta_certa;

        for(int x = 0; x < 5; x++){

            resposta_certa = gerarPergunta();

            do{

                resposta_aluno = input.nextInt();

                if(resposta_aluno == resposta_certa)
                    System.out.println("Muito bem!");
                else
                    System.out.println("Não. Por favor, tente de novo.");

            }while(resposta_certa != resposta_aluno);

        }

    }

    public static int gerarPergunta(){

        SecureRandom random = new SecureRandom();

        int x = random.nextInt(10);
        int y = random.nextInt(10);

        System.out.printf("Quanto é %d x %d?\n", x, y);

        return x*y;

    }

}
