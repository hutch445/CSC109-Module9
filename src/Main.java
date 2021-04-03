import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.*;



import javax.swing.JFrame;
import javax.swing.JPanel;

import git.tools.client.GitSubprocessClient;

public class Main extends JFrame {
    public static void main(String[] args) {
       
    	System.out.println("Test");
        GitSubprocessClient gitSubprocessClient = new GitSubprocessClient("insert repo path here");

        GitHubApiClient gitHubApiClient = new GitHubApiClient("insert user", "insert token");
        GetRepoInfoResponse repoInfo = gitHubApiClient.getRepoInfo("CSC109", "GitHubApiClient");
        new Main("test");
       
    }
    
    public Main(String title) {

        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.add(new Panel());
        
        this.setVisible(true);
      }

   
}
