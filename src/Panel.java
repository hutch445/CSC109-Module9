import git.tools.client.GitSubprocessClient;
import github.tools.client.GitHubApiClient;
import github.tools.client.RequestParams;
import github.tools.responseObjects.CreateRepoResponse;
import github.tools.responseObjects.GetRepoInfoResponse;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

	// Make this your token, delete before pushing this to GitHub
	private final String personalToken = "";
	private final String myGitHubUsername = "";
	private final String repoOwner = "hutch445";
	private final String repoName = "CSC109-Module9";
	private String repoPath = null;

	public Panel() {
		super();

		if (personalToken == null || myGitHubUsername == null) {
			System.out.println("Enter your personal token or GitHub username in Panel.java");
			System.exit(1);
		}
//		GitSubprocessClient gitSubprocessClient = new GitSubprocessClient(repoPath);
//		gitSubprocessClient.setRepoPath("C:\\Users\\kchut\\OneDrive\\Desktop\\school\\Current Classes\\CSC-109\\Module9Testing");
//		gitSubprocessClient.gitInit();
//		gitSubprocessClient.gitRemoteAdd("origin", "https://github.com/KyleChutjian/JavaRepositoryTesting.git");
//		gitSubprocessClient.gitAddFile("Main.java");

		GitHubApiClient gitHubApiClient = new GitHubApiClient(myGitHubUsername, personalToken);
		RequestParams requestParams = new RequestParams();
		requestParams.addParam("name", "JavaRepositoryTesting"); // name of repo
		CreateRepoResponse createRepoResponse = gitHubApiClient.createRepo(requestParams);

		//GetRepoInfoResponse repoInfo = gitHubApiClient.getRepoInfo(repoOwner, repoName);
		//System.out.println(gitSubprocessClient.getRepoPath());



		JButton button = new JButton("test");
		button.addActionListener(btn -> {
			System.out.println("Button was clicked");
			gitHubApiClient.createRepo(requestParams);
		});
		this.add(button);


	}
}
