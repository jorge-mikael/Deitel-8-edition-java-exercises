import java.security.SecureRandom;

public class App {

    public static void main(String[] args){

        int[] freq = new int[13];
        SecureRandom random = new SecureRandom();

        for(int cont = 0; cont < 36000000; cont++){

            int x = 1 + random.nextInt(6);
            int y = 1 + random.nextInt(6);

            switch(x + y){
                
                case 2:
                    freq[2]++;
                    break;
                case 3:
                    freq[3]++;
                    break;
                case 4:
                    freq[4]++;
                    break;
                case 5:
                    freq[5]++;
                    break;
                case 6:
                    freq[6]++;
                    break;
                case 7:
                    freq[7]++;
                    break;
                case 8:
                    freq[8]++;
                    break;
                case 9:
                    freq[9]++;
                    break;
                case 10:
                    freq[10]++;
                    break;
                case 11:
                    freq[11]++;
                    break;
                case 12:
                    freq[12]++;
    
            }

        }

        System.out.printf("Lado\tQuantidade\n");
        
        for(int cont = 2; cont < freq.length; cont++){

            System.out.printf("%d\t%d\n", cont, freq[cont]);

        }

    }

}
