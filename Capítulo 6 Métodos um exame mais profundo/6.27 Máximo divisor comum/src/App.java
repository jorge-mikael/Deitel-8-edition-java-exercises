import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = input.nextInt();

        System.out.println("O MDC é: " + mdc(x, y));

    }

    public static int mdc(int x, int y){

        int maior_inteiro = Math.max(x, y);
        int menor_inteiro = Math.min(x, y);
        int resto = maior_inteiro % menor_inteiro;
        int mdc = menor_inteiro;

        while (resto > 0){

            maior_inteiro = menor_inteiro;
            menor_inteiro = resto;

            resto = maior_inteiro % menor_inteiro;
            mdc = menor_inteiro;

        }

        return mdc;
    }
}
