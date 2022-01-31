import java.util.Scanner;

public class App{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a média de 0 a 100 ");
        int nota = input.nextInt();

        System.out.println("A nota é " + qualityPoints(nota));


    }

    public static int qualityPoints(int nota){

        int escolha = nota / 10;

        switch (escolha){
            case 10:
            case 9:
                return 4;
            case 8:
                return 3;
            case 7: 
                return 2;
            case 6:
                return 1;
            default:
                return 0;
        }
        

    }

}