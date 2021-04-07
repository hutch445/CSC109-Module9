import javax.swing.*;

public class MainPanel extends JPanel {

    private Main main;

    public MainPanel(Main main) {
        this.main = main;
        this.add(new OptionsPanel(this));



    }

    public void switchPanel(int i) {
        switch(i) {
            case 1:
                removeAll();
                this.removeAll();
                this.add(new CreateRepoPanel(this));
                this.revalidate();
                this.repaint();
                revalidate();
                repaint();
                System.out.println("End");

        }
    }
}
