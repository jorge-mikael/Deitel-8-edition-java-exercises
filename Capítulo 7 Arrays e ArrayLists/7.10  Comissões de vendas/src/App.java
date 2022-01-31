import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        int[] freq = new int[9];
        int vendas;
        final int salarioFixo = 200;
        int salario;
        final double taxa = 0.09;
        Scanner input = new Scanner(System.in);
        
        for(int x = 0; x < 10; x++){
            System.out.print("Digite o total de vendas: ");
            vendas = input.nextInt();

            salario = salarioFixo + (int)(vendas*taxa);

            switch(salario / 100){

                case 2:
                    freq[0]++;
                    break;
                case 3:
                    freq[1]++;
                    break;
                case 4:
                    freq[2]++;
                    break;
                case 5:
                    freq[3]++;
                    break;
                case 6:
                    freq[4]++;
                    break;
                case 7:
                    freq[5]++;
                    break;
                case 8:
                    freq[6]++;
                    break;
                case 9:
                    freq[7]++;
                    break;
                default:
                    freq[7]++;

            }

        }

        System.out.printf("%-18s %s %n", "Faixa", "Quantidade");

        for(int x = 0; x < freq.length; x++){

            if(x < freq.length - 1){
                System.out.printf("R$%d-%d = ", (x + 2)*100, (x + 2)*100 + 99);
                System.out.println(freq[x]);
            }else{
                System.out.println("R$ 1.000 e acima = " + freq[x]);
            }

        }

    }

}
