import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {

    private static final int VALUE_BANK_BALANCE = 1000;
    private static int bankBalance = VALUE_BANK_BALANCE;

    private static final  SecureRandom randomNumbers = new SecureRandom();
    
    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2; 
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int wager;
        int decisao;

        do{

            do{

                System.out.printf("Digite sua aposta menor que %d: ", bankBalance);
                wager = input.nextInt();

            }while(wager > bankBalance);

            int myPoint = 0;
            Status gameStatus;

            int sumOfDice = rollDice();

            switch (sumOfDice)
            {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: 
                case TREY:  
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice; 
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            while ( gameStatus == Status.CONTINUE )
            {
                sumOfDice = rollDice(); 

                if (sumOfDice == myPoint)
                    gameStatus = Status.WON ;
                else
                    if (sumOfDice == SEVEN)
                        gameStatus = Status.LOST; 

            }

            if (gameStatus == Status.WON){
                System.out.println("Player wins");
                bankBalance += wager;
                System.out.printf("O bankBalance é: %d\n", bankBalance);
            }
            else{
                System.out.println("Player loses");
                bankBalance -= wager;
                System.out.printf("O bankBalance é: %d\n", bankBalance);
            }

            if(bankBalance > 0){
                conversa();
                System.out.print("Digite 0 para jogar novamente e qualquer outro para desistir: ");
                decisao = input.nextInt();
            }else{
                decisao = 1;
                System.out.println("Desculpe, mas você faliu!");
            }

        }while(decisao == 0);

   }

   public static int rollDice()
   {

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        
        System.out.printf("Player rolled %d + %d = %d%n",
            die1, die2, sum);

            return sum; 
   }

   public static void conversa()
   {

        int frase = randomNumbers.nextInt(3);

        if(bankBalance < VALUE_BANK_BALANCE){

            switch(frase){
                case 0:
                    System.out.println("Oh, parece que você vai quebrar, hein?");
                    break;
                case 1:
                    System.out.println("Você está com uma péssima sorte hoje!");
                    break;
                case 2:
                    System.out.println("A situação está ficando complicada!");
            }

        }else{

            switch(frase){
                case 0:
                    System.out.println("Ah, vamos lá, dê uma chance para sua sorte");
                    break;
                case 1:
                    System.out.println("Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!");
                    break;
                case 2:
                    System.out.println("Você é muito bom nisso!");
            }

        } 

   }

}
