import java.security.SecureRandom;
import java.util.Scanner;

public class App {

    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int resposta_aluno;
        int resposta_certa;

        for(int x = 0; x < 5; x++){

            resposta_certa = gerarPergunta();

            do{

                resposta_aluno = input.nextInt();

                if(resposta_aluno == resposta_certa)
                    gerarFraseCorreta();
                else
                    gerarFraseIncorreta();

            }while(resposta_certa != resposta_aluno);

        }

    }

    public static int gerarPergunta(){

        int x = random.nextInt(10);
        int y = random.nextInt(10);

        System.out.printf("Quanto é %d x %d?\n", x, y);

        return x*y;

    }

    public static void gerarFraseIncorreta(){

        int escolha = random.nextInt(4);

        switch(escolha){
            case 0:
                System.out.println("Não. Por favor, tente de novo.");
                break;
            case 1:
                System.out.println("Errado. Tente mais uma vez.");
                break;
            case 2:
                System.out.println("Não desista!");
                break;
            case 3:
                System.out.println("Não. Continue tentando.");
        }

    }

    public static void gerarFraseCorreta(){

        int escolha = random.nextInt(4);

        switch(escolha){
            case 0:
                System.out.println("Muito bom!");
                break;
            case 1:
                System.out.println("Excelente!");
                break;
            case 2:
                System.out.println("Bom trabalho!");
                break;
            case 3:
                System.out.println("Mantenha um bom trabalho!");
        }

    }

}
