import javax.swing.JFrame;

public class FormasAleatoriasTeste {
    
    public static void main(String[] args){

        FormasAleatorias panel = new FormasAleatorias();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 520);
        app.setVisible(true);

    }

}
