public class App {
    
    public static void main(String[] args){

        System.out.printf("%10s %10s %10s\n", "Binario", "Hexa", "Octal");

        for(int x = 1; x <= 256; x++){

            System.out.printf("%10s %10s %10s\n", convBin(x), convOct(x), convHexa(x));

        }

    }

    public static String convHexa(int numero){

        int resto;
        String digito = "";
        String hexa = "";

        for(int x = numero; x > 0; x /= 16){

            resto = x % 16;

            if(resto < 10){
                digito = Integer.toString(resto);
            }else{
                switch(resto){
                    case 10:
                        digito = "A";
                        break;
                    case 11: 
                        digito = "B";
                        break;
                    case 12:
                        digito = "C";
                        break;
                    case 13:
                        digito = "D";
                        break;
                    case 14: 
                        digito = "E";
                        break;
                    case 15:
                        digito = "F";
                }
            }

            hexa = digito + hexa;

        }

        return hexa;

    }

    public static String convBin(int numero){

        String decimal = "";
        
        for(int x = numero; x > 0; x /= 2){

            int resto = x % 2;
            decimal = resto + decimal;

        }

        return decimal;

    }

    public static String convOct(int numero){

        String oct = "";
        
        for(int x = numero; x > 0; x /= 8){

            int resto = x % 8;
            oct = resto + oct;

        }

        return oct;

    }

}
