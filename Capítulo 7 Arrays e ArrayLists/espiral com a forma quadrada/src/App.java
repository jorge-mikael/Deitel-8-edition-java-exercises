import javax.swing.JFrame;

public class App
{
    public static void main(String[] args)
    {
        EspiralQuadrada panel = new EspiralQuadrada();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}