import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.*;
import git.tools.client.GitSubprocessClient;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        GitSubprocessClient gitSubprocessClient = new GitSubprocessClient("insert repo path here");

        GitHubApiClient gitHubApiClient = new GitHubApiClient("insert user", "insert token");
        GetRepoInfoResponse repoInfo = gitHubApiClient.getRepoInfo("CSC109", "GitHubApiClient");
    }
}
