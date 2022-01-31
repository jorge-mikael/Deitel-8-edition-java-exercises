public class App {

    public static void main(String[] args){

        int x = 2;
        int y = 5;
        int z = 7;

        System.out.println("O resultado da multiplicação é: " + multiplicarInteiros(x, y, z));

    }

    public static int multiplicarInteiros(int... numero){

        int resultado = 1;

        for(int x : numero){
            resultado *= x;
        }

        return resultado;
        
    }

}
