import javax.swing.*;

public class MainPanel extends JPanel {

    private Main main;

    public MainPanel(Main main) {
        this.main = main;
        JLabel label = new JLabel("Testing");
        JButton btn = new JButton("Create Repository");
        btn.addActionListener(x -> {
            System.out.println("Button clicked");
        });


        this.add(label);
        this.add(btn);
    }

}
