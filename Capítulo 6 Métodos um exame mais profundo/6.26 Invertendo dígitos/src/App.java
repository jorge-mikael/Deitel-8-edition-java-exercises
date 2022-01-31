import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        int numero;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        System.out.println("O número invertido é "+ inverterNumero(numero));

    }

    public static int inverterNumero(int numero){

        int y = numero;
        int qtd_dig = 0;

        while (y > 0){
            
            y /= 10;
            qtd_dig ++;

        }

        int numero_invertido = 0;

        for (int x = numero; x > 0; x /= 10){

            int parte = x%10;
            numero_invertido += parte*Math.pow(10, qtd_dig - 1);
            qtd_dig --;

        }

        return numero_invertido;

    }

}
