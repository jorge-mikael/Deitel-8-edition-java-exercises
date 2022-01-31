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

        System.out.print("Digite o nivel de dificuldade: ");
        int nivel = input.nextInt();

        for(int x = 0; x < QTD_RESPOSTAS; x++){

            resposta_certa = gerarPergunta(nivel);

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

    public static int gerarPergunta(int nivel){

        int inicializador;
        int quantidade;

        if(nivel == 1)
            inicializador = 0;
        else
            inicializador = (int) Math.pow(10, nivel - 1);

        quantidade = (int) Math.pow(10, nivel);

        int x = inicializador + random.nextInt(quantidade - inicializador);
        int y = inicializador + random.nextInt(quantidade - inicializador);

        System.out.printf("Quanto é %d x %d?\n", x, y);

        return x*y;

    }

}
