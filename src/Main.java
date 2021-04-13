import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main("Integrated GitHub GUI");
    }

    private MainPanel mainPanel;

    public Main(String title) {
        super(title);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        mainPanel = new MainPanel(this);
        this.add(mainPanel);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
      }
}
