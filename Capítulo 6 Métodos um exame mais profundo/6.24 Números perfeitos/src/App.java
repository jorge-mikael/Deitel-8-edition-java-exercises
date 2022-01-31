public class App {

    public static void main(String[] args){

        for(long x = 1; x <= 1000000000; x++){
            
            if(isPerfect(x)){

                System.out.printf("%d = ", x);

                for(long y = 1; y < x; y++){

                    if(x%y == 0){

                        System.out.printf("%d, ", y);

                    }

                }
                
                System.out.println();
                
            }

             

        }

    }

    public static boolean isPerfect(long numero){

        long soma = 0;

        for(long x = 1; x < numero; x++){

            if(numero%x == 0){

                soma += x;

            }

        }

        if(soma == numero){
            return true;
        }else{
            return false;
        }

    }

}
