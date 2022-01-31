import java.util.Scanner;

public class App {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[5];

        for(int x = 0; x < numeros.length; x++){

            System.out.print("\nDigite um número de 10 a 100: ");
            numeros[x] = input.nextInt();

            for(int y = 0; y < x + 1; y++){
                
                boolean EhRepetido = false;
                for(int z = 0; z < y; z++){

                    if(numeros[y] == numeros[z]){
                        EhRepetido = true;
                        break;
                    }

                }

                if(EhRepetido == false)
                    System.out.printf("%d, ", numeros[y]);

            }

        }

    }

}
