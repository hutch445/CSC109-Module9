import javax.swing.JFrame;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main("Integrated GitHub GUI");
    }
    
    public Main(String title) {

        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.add(new MainPanel(this));
        
        this.setVisible(true);
      }

   
}
