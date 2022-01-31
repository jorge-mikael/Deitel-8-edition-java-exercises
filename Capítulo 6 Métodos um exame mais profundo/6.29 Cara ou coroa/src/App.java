import java.util.Scanner;
import java.security.SecureRandom;

public class App{

    private enum Lado{
        CARA,
        COROA
    }

    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int qtd_cara = 0;
        int qtd_coroa = 0;
        int x;

        do{

            Lado lado = flip();

            if(lado == Lado.CARA){
                qtd_cara ++;
                System.out.println("O lado é CARA");
            }else{
                qtd_coroa ++;
                System.out.println("O lado é COROA");
            }

            System.out.println("Quantidade de CARAS: " + qtd_cara);
            System.out.println("Quantidade de COROAS: " + qtd_coroa);

            System.out.print("Digite 0 para lançar a moeda novamente e qualquer outro número para encerrar: ");
            x = input.nextInt();

        } while(x == 0);

    }

    public static Lado flip(){

        int escolha = random.nextInt(2);

        switch (escolha){
            case 0:
                return Lado.CARA;
            default:
                return Lado.COROA;
        }

    } 

}