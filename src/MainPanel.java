import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private Main main;

    public MainPanel(Main main) {
        this.main = main;
        this.add(new OptionsPanel(this));
        this.setBackground(Color.lightGray);

    }
    public void switchPanel(int i, boolean isDark) {
        switch(i) {
            case 1:
                this.removeAll();
                this.add(new CreateRepoPanel(this,isDark));
                this.revalidate();
                this.repaint();
                break;
            case 2:
                this.removeAll();
                this.add(new UploadPanel(this,isDark));
                this.revalidate();
                this.repaint();
                break;
            case 3:

        }
    }
}
