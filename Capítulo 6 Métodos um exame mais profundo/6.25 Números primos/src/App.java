public class App {
    
    public static void main(String[] args){

        for(int x = 1; x <= 10000; x++){

            if(isPrimo(x)){

                System.out.printf("%d, ", x);

            }

        }

    }

    public static boolean isPrimo(int numero){

        int limite = (int) Math.sqrt(numero);

        for(int x = 1; x <= limite; x++){

            if(numero%x == 0 && x != 1){

                return false;
                
            }

        }

        return true;

    }

}
