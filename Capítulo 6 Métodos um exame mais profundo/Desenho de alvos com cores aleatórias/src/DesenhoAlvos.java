import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class DesenhoAlvos extends JPanel{

    private SecureRandom random = new SecureRandom();

    //gera a primeira cor aleatória
    private int cor1_r = random.nextInt(256);
    private int cor1_g = random.nextInt(256);
    private int cor1_b = random.nextInt(256);
    private Color cor1 = new Color(cor1_r, cor1_g, cor1_b);

    //gera a segunda cor aleatória
    private int cor2_r = random.nextInt(256);
    private int cor2_g = random.nextInt(256);
    private int cor2_b = random.nextInt(256);
    private Color cor2 = new Color(cor2_r, cor2_g, cor2_b);

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        
        int qtd_formas = 5;//quantidade de circulos
        int largura = getWidth();
        int altura = getHeight();

        int raio_inicial = largura/(2*qtd_formas);//define o raio do circulo do meio

       
        
        //loop para desenhar as formas
        for(int x = 0; x < qtd_formas; x++){

            //condição para alternar as corer das formas
            if(x%2 == 0){
                
                g.setColor(cor1);
                g.fillOval(0 + x*raio_inicial, 0 + x*raio_inicial, largura - x*2*raio_inicial, altura - x*2*raio_inicial);
               
            }else{

                g.setColor(cor2);
                g.fillOval(0 + x*raio_inicial, 0 + x*raio_inicial, largura - x*2*raio_inicial, altura - x*2*raio_inicial);

            }

        }

    }

}
