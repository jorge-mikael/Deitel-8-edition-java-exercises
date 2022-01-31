public class App {

    public static void main(String[] args){

        int tamanhoArray;

        if(args.length == 0){
            tamanhoArray = 10;
        }else{
            tamanhoArray = Integer.parseInt(args[0]);
        }

        int[] array = new int[tamanhoArray];

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) 
            System.out.printf("%5d%8d%n", counter, array[counter]);

    }

}
