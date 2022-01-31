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

        do{

            System.out.print("Digite o número: ");
            int numero = input.nextInt();

            if(numero == numero_aleatorio){
                estado = Status.VENCEU;
                System.out.println("Parabéns! Você acertou o número!");
            }else if(numero < numero_aleatorio){
                System.out.println("Muito baixo. Tente novamente.");
            }else{
                System.out.println("Muito alto. Tente novamente");
            }

        } while(estado == Status.TENTE_NOVAMENTE);

    }

}