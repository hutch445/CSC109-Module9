import git.tools.client.GitSubprocessClient;
import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.GetRepoInfoResponse;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

	// Make this your token, delete before pushing this to GitHub
	private final String personalToken = "";
	private final String myGitHubUsername = "";
	private final String repoOwner = "hutch445";
	private final String repoName = "CSC109-Module9";

	public Panel() {
		super();

		if (personalToken == null || myGitHubUsername == null) {
			System.out.println("Enter your personal token in Panel.java");
			System.exit(1);
		}

		JButton button = new JButton("test");
		button.addActionListener(btn -> {
			System.out.println("Button was clicked");
		});
		this.add(button);

		GitSubprocessClient gitSubprocessClient = new GitSubprocessClient("insert repo path here");

		GitHubApiClient gitHubApiClient = new GitHubApiClient(myGitHubUsername, personalToken);
		GetRepoInfoResponse repoInfo = gitHubApiClient.getRepoInfo(repoOwner, repoName);

//		System.out.println(repoInfo.getDescription());


	}
}
