import java.util.Scanner;
import java.security.SecureRandom;

public class App{

    private enum Status{
        TENTE_NOVAMENTE,
        VENCEU
    }

    private static final int MAX = 1000;

    public static void main(String[] args){

        Status estado = Status.TENTE_NOVAMENTE;
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int numero_aleatorio = 1 + random.nextInt(MAX);

        System.out.printf("Advinhe o número de 1 a %d\n", MAX);

        int qtd_adv = 0;

        do{

            System.out.print("Digite o número: ");
            int numero = input.nextInt();

            if(numero == numero_aleatorio){
                estado = Status.VENCEU;
                System.out.println("Paranéns! Você acertou o número!");
            }else if(numero < numero_aleatorio){
                System.out.println("Muito baixo. Tente novamente.");
            }else{
                System.out.println("Muito alto. Tente novamente");
            }

            qtd_adv ++;

        } while(estado == Status.TENTE_NOVAMENTE);

        if(qtd_adv == 10){
            System.out.println("Aha! Você sabe o segredo!");
        }else if(qtd_adv < 10){
            System.out.println("Você sabe o segredo ou tem muita sorte!");
        }else{
            System.out.println("Você deve ser capaz de fazer melhor");
        }   

    }

}