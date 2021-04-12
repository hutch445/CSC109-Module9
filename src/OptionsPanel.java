import javax.swing.*;
import java.awt.*;

public class OptionsPanel extends JPanel {
    public OptionsPanel(MainPanel mainPanel) {
        super(new GridLayout(5,1));



        JButton createRepo = new JButton("Create Repository");
        createRepo.addActionListener(x -> {
            mainPanel.switchPanel(1);
        });
        JButton editRepo = new JButton("Edit Repository");
        editRepo.addActionListener(x -> {
            mainPanel.switchPanel(2);
        });

        this.add(new JLabel());
        this.add(createRepo);
        this.add(new JLabel());
        this.add(editRepo);


    }
}
