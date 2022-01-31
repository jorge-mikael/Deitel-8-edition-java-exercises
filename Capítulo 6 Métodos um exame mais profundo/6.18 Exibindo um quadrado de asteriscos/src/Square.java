import java.util.Scanner;

public class Square{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho: ");
        int side = input.nextInt();

        squareOfAsterisks(side);

    }

    public static void squareOfAsterisks(int side){

        for(int x = 0; x < side; x++){
            
            for(int y = 0; y < side; y++){

                System.out.print("*");

            }

            System.out.println();

        }

    }

}