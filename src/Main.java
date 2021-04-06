import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.*;



import javax.swing.JFrame;
import javax.swing.JPanel;

import git.tools.client.GitSubprocessClient;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main("Module 9 - Group 2");
    }
    
    public Main(String title) {

        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.add(new Panel());
        
        this.setVisible(true);
      }

   
}
