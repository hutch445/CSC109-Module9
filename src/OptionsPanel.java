import javax.swing.*;

public class OptionsPanel extends JPanel {
    public OptionsPanel(MainPanel mainPanel) {
        JLabel label = new JLabel("Testing");
        JButton btn = new JButton("Create Repository");
        btn.addActionListener(x -> {
            System.out.println("Button clicked");
            mainPanel.switchPanel(1);
        });


        this.add(label);
        this.add(btn);

    }
}
