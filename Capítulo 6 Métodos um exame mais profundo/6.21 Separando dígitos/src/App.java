import java.util.Scanner;

public class App{
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numero; 

        do{
            System.out.print("Digite um numero: ");
            numero = input.nextInt();
        }while(numero > 99999 || numero < 1);

        displayDigits(numero);

    }

    public static void displayDigits(int numero){

        int x = 10000;
        boolean achou_numero = false;

        while(x > 0){

            if(quociente(numero,x) > 0 || achou_numero == true){
                
                System.out.printf("%d  ", quociente(numero,x));
                numero = resto(numero, x);
                achou_numero = true;
            
            }

            x /= 10;

        }

    }

    public static int quociente(int dividendo, int divisor){

        return dividendo/divisor;

    }

    public static int resto(int dividendo, int divisor){

        return dividendo%divisor;

    }

}