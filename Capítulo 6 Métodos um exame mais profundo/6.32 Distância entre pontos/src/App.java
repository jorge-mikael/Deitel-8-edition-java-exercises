import java.util.Scanner;

public class App{

    public static void main(String[] args){

        double x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite as coordenadas: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();

        System.out.println("A distância é " + distance(x1, y1, x2, y2));

    }

    public static double distance(double x1, double y1, double x2, double y2){

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

    }

}