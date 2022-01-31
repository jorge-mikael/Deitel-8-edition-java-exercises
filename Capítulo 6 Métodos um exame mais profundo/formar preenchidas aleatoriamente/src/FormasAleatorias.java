import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class FormasAleatorias extends JPanel {

    private final int QTD_FORMAS = 10;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        SecureRandom random = new SecureRandom();

        for(int x = 0; x < QTD_FORMAS; x++){

            int cor_r = random.nextInt(256);
            int cor_g = random.nextInt(256);
            int cor_b = random.nextInt(256);

            Color cor = new Color(cor_r, cor_g, cor_b);

            g.setColor(cor);
            
            int largura = getWidth();
            int altura = getHeight();
            
            int forma_x = random.nextInt(largura);
            int forma_y = random.nextInt(altura);
            int forma_largura;
            int forma_altura;

            if(forma_x > largura/2){
                forma_largura = 1 + random.nextInt(largura - forma_x);
            }else{
                forma_largura = 1 + random.nextInt(largura/2);
            }

            if(forma_y > altura/2){
                forma_altura = 1 + random.nextInt(altura = forma_y);
            }else{
                forma_altura = 1 + random.nextInt(altura/2);
            }

            int forma = random.nextInt(2);

            switch(forma){
                case 0:
                    g.fillRect(forma_x, forma_y, forma_largura, forma_altura);
                    break;
                case 1:
                    g.fillOval(forma_x, forma_y, forma_largura, forma_altura);
            }


        }

    }

}
