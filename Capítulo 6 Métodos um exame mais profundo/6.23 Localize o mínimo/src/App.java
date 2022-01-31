import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double x = input.nextDouble();
        System.out.print("Digite um número: ");
        double y = input.nextDouble();
        System.out.print("Digite um número: ");
        double z = input.nextDouble();

        System.out.println("O número menor é " + minimum3(x, y, z));

    }

    public static double minimum3(double x, double y, double z){

        return Math.min(x, Math.min(y, z));

    }

}
