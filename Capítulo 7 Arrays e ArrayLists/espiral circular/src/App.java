import javax.swing.JFrame;

public class App
{
    public static void main(String[] args)
    {
        EspiralCircular panel = new EspiralCircular();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}