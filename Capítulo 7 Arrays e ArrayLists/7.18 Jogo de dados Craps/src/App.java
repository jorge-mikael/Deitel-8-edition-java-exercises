import java.security.SecureRandom;

public class App {

    private static final  SecureRandom randomNumbers = new SecureRandom();
    
    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2; 
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args)
    {

        int[] freq = new int[3];

        for(int cont = 0; cont < 1000000; cont++){

            switch(playCraps()){

                case WON:
                    freq[0]++;
                    break;
                case LOST:
                    freq[1]++;
                    break;
                default:
                    freq[2]++;

            }

            if(cont < 20){
                System.out.println("Jogos ganhos: " + freq[0]);
                System.out.println("Jogos perdidos: " + freq[1]);
            }

        }

        System.out.println("Total de jogos ganhos: " + freq[0]);
        System.out.println("Total de jogos perdidos: " + freq[1]);

        System.out.printf("\nAs chances de ganhar no craps são de %.2f%%", ((double)freq[0] / 1000000) * 100);

   }

   public static Status playCraps(){

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
                    //System.out.printf("Point is %d%n", myPoint);
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

            return gameStatus;

        }

   public static int rollDice()
   {

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        
        //System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum; 
   }

}
