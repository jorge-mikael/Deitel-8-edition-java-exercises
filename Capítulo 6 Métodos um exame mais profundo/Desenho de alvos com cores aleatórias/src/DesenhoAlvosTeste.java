import javax.swing.JFrame;

public class DesenhoAlvosTeste{

    public static void main(String[] args){

        DesenhoAlvos panel = new DesenhoAlvos();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 320);
        app.setVisible(true);

    }

}