import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();
        System.out.print("Digite qual a conversão: 1 para celsios e 2 para fahrenheit ");
        int escolha = input.nextInt();
        double temperatura_convertida = 0;

        switch(escolha){
            case 1:
                temperatura_convertida = celsius(temperatura);
                break;
            case 2:
                temperatura_convertida = fahrenheit(temperatura);
        }

        System.out.println("A temperatura convertida é " + temperatura_convertida);

    }

    public static double celsius(double temperatura){

        return 5.0 / 9.0 * (temperatura - 32);

    }

    public static double fahrenheit(double temperatura){

        return 9.0 / 5.0 * temperatura + 32;

    }

}