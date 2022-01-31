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

        System.out.println("Digite a operação:");
        System.out.println("1 para adição");
        System.out.println("2 para subtração");
        System.out.println("3 para multiplicação");
        System.out.println("4 para divisão");
        System.out.println("5 para aleatórios");
        int operacao = input.nextInt();

        for(int x = 0; x < QTD_RESPOSTAS; x++){

            resposta_certa = gerarPergunta(nivel, operacao);

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

    public static int gerarPergunta(int nivel, int operacao){

        int inicializador;
        int quantidade;
        int escolha;
        int resultado = 0;

        if(operacao == 5)
            escolha = 1 + random.nextInt(4);
        else
            escolha = operacao;
        
        if(nivel == 1)
            inicializador = 0;
        else
            inicializador = (int) Math.pow(10, nivel - 1);

        quantidade = (int) Math.pow(10, nivel);

        int x = inicializador + random.nextInt(quantidade - inicializador);
        int y = inicializador + random.nextInt(quantidade - inicializador);

        int troca = 0;
        switch(escolha){

            case 1:
                System.out.printf("Quanto é %d + %d?\n", x, y);
                resultado = x + y;
                break;

            case 2:
                if(x < y){
                    troca = y;
                    y = x;
                    x = troca;
                }   
                System.out.printf("Quanto é %d - %d?\n", x, y);
                resultado = x - y;
                break;

            case 3:
                System.out.printf("Quanto é %d x %d?\n", x, y);
                resultado = x * y;
                break;

            case 4:
                if(y == 0)
                    y = 1 + inicializador + random.nextInt(quantidade - inicializador);
                if(x < y){
                    troca = y;
                    y = x;
                    x = troca;
                }   
                System.out.printf("Quanto é %d / %d?\n", x, y);
                resultado = x / y;

        }

        return resultado;

    }

}
