import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class EspiralQuadrada extends JPanel{

    private static final int QTD_ESPIRAIS = 10;

    public void paintComponent(Graphics g){

        int largura = getWidth();
        int altura = getHeight() - 20;

        int centroX = largura / 2;
        int centroY = altura / 2;

        int tamanho = altura / 10;

        for(int cont = 1; cont <= QTD_ESPIRAIS; cont++){

            if(cont % 2 != 0){

                g.drawLine(centroX, centroY, centroX, centroY + tamanho*cont);

                g.drawLine(centroX, centroY + tamanho*cont, centroX - tamanho*cont, centroY + tamanho*cont);

                centroX -= tamanho*cont;
                centroY += tamanho*cont;

            }else{

                g.drawLine(centroX, centroY, centroX, centroY - tamanho*cont);

                g.drawLine(centroX, centroY - tamanho*cont, centroX + tamanho*cont, centroY - tamanho*cont);

                centroX += tamanho*cont;
                centroY -= tamanho*cont;

            }

        }

    }

}