public class App{

    public static void main(String[] args){

        double soma = 0.0;

        for(String numero : args){

            soma += Double.parseDouble(numero);

        }

        System.out.println("A soma é " + soma);
        
    }

}

