import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean[] assento = new boolean[11];

        for(int cont = 1; cont < assento.length; cont++){

            boolean primeiraClasseDisponivel = false;
            boolean economicaDisponivel = false;
            int primeiraClasseLugarDisponivel = 0;
            int economicaLugarDisponivel = 0;
            for(int cont2 = 1; cont2 < assento.length; cont2++){

                if(cont2 <= 5 && assento[cont2] == false){
                    primeiraClasseDisponivel = true;
                    primeiraClasseLugarDisponivel = cont2;
                }

                if(cont2 > 5 && assento[cont2] == false){
                    economicaDisponivel = true;
                    economicaLugarDisponivel = cont2;
                }     

            }

            int escolha;

            if(primeiraClasseDisponivel == true && economicaDisponivel == true){

                System.out.print("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica: ");
                escolha = input.nextInt();
                if(escolha == 1)
                    assento[primeiraClasseLugarDisponivel] = true;
                else
                    assento[economicaLugarDisponivel] = true;

            }

            if(primeiraClasseDisponivel == true && economicaDisponivel == false){

                System.out.print("Classe econômica lotada! Digite 1 se deseja ficar na primeira classe e digite 2 para cancelar: ");
                escolha = input.nextInt();
                if(escolha == 1)
                    assento[primeiraClasseLugarDisponivel] = true;
                else
                    System.out.print("O próximo voo parte em 3 horas");

            }

            if(primeiraClasseDisponivel == false && economicaDisponivel == true){

                System.out.print("Primeira classe lotada! Digite 1 se deseja ficar na classe econõmica e digite 2 para cancelar: ");
                escolha = input.nextInt();
                if(escolha == 1)
                    assento[economicaLugarDisponivel] = true;
                else
                    System.out.print("O próximo voo parte em 3 horas");

            }
            
            for(int cont2 = 1; cont2 < assento.length; cont2++)
                System.out.println(assento[cont2]);

        }

    }

}
