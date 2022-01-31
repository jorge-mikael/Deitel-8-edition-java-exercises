import java.awt.Graphics;
import javax.swing.JPanel;

public class EspiralCircular extends JPanel{

    private static final int QTD_CIRCULOS = 10;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int largura = getWidth();
        int altura = getHeight() - 20;
        int raio = altura/20;
        
        int pontoX = largura / 2;
        int pontoY = altura / 2 - raio;

        for(int cont = 1; cont <= QTD_CIRCULOS; cont++){

            if(cont % 2 != 0){

                g.drawArc(pontoX - raio*(cont-1), pontoY - raio*(cont-1), 2*raio*cont, 2*raio*cont, 180, -180);

            }else{

                g.drawArc(pontoX - 2*raio*(cont/2), pontoY - raio*(cont-1), 2*raio*cont, 2*raio*cont, 0, -180);

            }

        }

       
    }

}
