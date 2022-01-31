import java.security.SecureRandom;
import java.util.Scanner;

public class App {

    private static SecureRandom random = new SecureRandom();
    private static final int QTD_RESPOSTAS = 10;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int resposta_aluno;
        int resposta_certa;
        int qtd_respostas_certas = 0;

        for(int x = 0; x < QTD_RESPOSTAS; x++){

            resposta_certa = gerarPergunta();

            resposta_aluno = input.nextInt();

            if(resposta_aluno == resposta_certa)
                qtd_respostas_certas++;
                
        }

        int desempenho = (qtd_respostas_certas * 100) / QTD_RESPOSTAS;

        if(desempenho < 75)
            System.out.println("Peça ajuda extra ao seu professor.");
        else   
            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");

    }

    public static int gerarPergunta(){

        int x = random.nextInt(10);
        int y = random.nextInt(10);

        System.out.printf("Quanto é %d x %d?\n", x, y);

        return x*y;

    }

}
