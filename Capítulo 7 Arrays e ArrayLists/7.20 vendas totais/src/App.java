import java.security.SecureRandom;

public class App {

    public static void main(String[] Args){

        int[][] sales = new int[6][5];
        int prod;
        int vend;
        int total;
        SecureRandom random = new SecureRandom();

        int qtd_vendida;

        for(int dia = 1; dia <= 30; dia++){

            qtd_vendida = random.nextInt(6);
            for(int cont = 0; cont < qtd_vendida; cont++){

                vend = 1;
                prod = 1 + random.nextInt(5);
                total = 1 + random.nextInt(1000);
                sales [prod][vend] += total;

            }

            qtd_vendida = random.nextInt(6);
            for(int cont = 0; cont < qtd_vendida; cont++){

                vend = 2;
                prod = 1 + random.nextInt(5);
                total = 1 + random.nextInt(1000);
                sales [prod][vend] += total;

            }

            qtd_vendida = random.nextInt(6);
            for(int cont = 0; cont < qtd_vendida; cont++){

                vend = 3;
                prod = 1 + random.nextInt(5);
                total = 1 + random.nextInt(1000);
                sales [prod][vend] += total;

            }

            qtd_vendida = random.nextInt(6);
            for(int cont = 0; cont < qtd_vendida; cont++){

                vend = 4;
                prod = 1 + random.nextInt(5);
                total = 1 + random.nextInt(1000);
                sales [prod][vend] += total;

            }

        }

        System.out.printf("%9s %s %s %s %s %s\n", "Produto", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4", "Total");

        for(int i = 1; i < sales.length; i++){

            System.out.printf("%s %d ","Produto", i);

            int total_prod = 0;

            for(int j = 1; j < sales[i].length; j++){

                System.out.printf("%10d ", sales[i][j]);

                sales[i][0] += sales[i][j];
                sales[0][j] += sales[i][j];

            }

            System.out.printf("%d", sales[i][0]);

            System.out.println();

        }

        System.out.printf("%9s ", "Total");

        for(int i = 1; i < sales[0].length; i++ ){

            System.out.printf("%10d ",  sales[0][i]);

        }



    }

}
