import java.util.Scanner;

public class Circle{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
         
        System.out.print("Digite o raio: ");
        
        double raio = input.nextDouble();
        System.out.println("A Área do circulo é: " + circleArea(raio));


    }

    public static double circleArea(double raio){

        return 2*raio*Math.PI;

    }

}