import java.util.Scanner;

public class Square{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho: ");
        int side = input.nextInt();
        System.out.print("Digite o caractere: ");
        char fill = input.next().charAt(0);

        squareOfAsterisks(side, fill);

    }

    public static void squareOfAsterisks(int side, char fillCharacter){

        for(int x = 0; x < side; x++){
            
            for(int y = 0; y < side; y++){

                System.out.print(fillCharacter);

            }

            System.out.println();

        }

    }

}