import javax.swing.*;
import java.awt.*;

public class OptionsPanel extends JPanel {
    private MainPanel mainPanel;
    private boolean isDark = false;
    public OptionsPanel(MainPanel mainPanel) {
        super(new GridLayout(8,1));
        this.mainPanel = mainPanel;
        this.setBackground(Color.LIGHT_GRAY);

        JButton createRepo = new JButton("Create Repository");
        createRepo.addActionListener(x -> {
            mainPanel.switchPanel(1,isDark);
        });
        JButton editRepo = new JButton("Edit Repository");
        editRepo.addActionListener(x -> {
            mainPanel.switchPanel(2,isDark);
        });
        JButton changeColor = new JButton("Dark Mode");
        changeColor.addActionListener(x -> {
            isDark = !isDark;
            if (isDark) {
                this.setBackground(Color.DARK_GRAY);
                mainPanel.setBackground(Color.DARK_GRAY);
                changeColor.setText("Light Mode");

            } else {
                this.setBackground(Color.LIGHT_GRAY);
                mainPanel.setBackground(Color.LIGHT_GRAY);
                changeColor.setText("Dark Mode");
            }
        });

        this.add(new JLabel());
        this.add(createRepo);
        this.add(new JLabel());
        this.add(editRepo);
        this.add(new JLabel());
        this.add(changeColor);


    }
}
