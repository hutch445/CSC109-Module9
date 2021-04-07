import git.tools.client.GitSubprocessClient;
import github.tools.client.GitHubApiClient;
import github.tools.client.QueryParams;
import github.tools.client.RequestFailedException;
import github.tools.client.RequestParams;
import github.tools.responseObjects.CreateRepoResponse;
import github.tools.responseObjects.GetRepoInfoResponse;
import github.tools.responseObjects.ListReposResponse;

import javax.swing.*;
import java.awt.*;

public class CreateRepoPanel extends JPanel {

	// Make this your token, delete before pushing this to GitHub
	private Main main;

	public CreateRepoPanel(Main main) {
		super(new GridLayout(10,2));
		super.setSize(500,500);
		this.main = main;

		// Creating Rows
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();
		JPanel row3 = new JPanel();
		JPanel row4 = new JPanel();
		JPanel row5 = new JPanel();
		JPanel lastRow = new JPanel();
		JPanel errorRow = new JPanel();
		JLabel errorLabel = new JLabel("");
		errorRow.add(errorLabel);

		// Setting JLabels and JTextFields
		JLabel usernameLabel = new JLabel("Enter GitHub Username: ");
		JTextField usernameText = new JTextField("",15);
		row1.add(usernameLabel);
		row1.add(usernameText);

		JLabel tokenLabel = new JLabel("Enter GitHub Token: ");
		JTextField tokenText = new JTextField("",15);
		row2.add(tokenLabel);
		row2.add(tokenText);

		JLabel repoNameLabel = new JLabel("Enter Repo Name: ");
		JTextField repoNameText = new JTextField("",15);
		row5.add(repoNameLabel);
		row5.add(repoNameText);

		// Creating button and adding anonymous class
		JButton button = new JButton("Create Repository");
		button.addActionListener(btn -> {
			System.out.println("Button was clicked");
			final String myGitHubUsername = usernameText.getText();
			final String myGitHubToken = tokenText.getText();
			final String myRepoName = repoNameText.getText();

			RequestParams requestParams = new RequestParams();
			requestParams.addParam("name", myRepoName);
			GitHubApiClient gitHubApiClient = new GitHubApiClient(myGitHubUsername, myGitHubToken);
			ListReposResponse repos = null;
			try {
				repos = gitHubApiClient.listRepos(null);
				errorLabel.setText("Success!");
				errorLabel.setForeground(new Color(31, 143, 61));
				main.repaint();
			} catch (RequestFailedException e) {
				System.out.println("Invalid Token");
				errorLabel.setText("Error: Invalid Token");
				errorLabel.setForeground(Color.RED);
				main.repaint();
			}

			boolean doesExist = false;
			if (repos != null) {
				for (int i = 0; i < repos.getRepos().size(); i++) {
					if (repos.getRepos().get(i).getRepoName().equalsIgnoreCase(myRepoName)) {
						System.out.println("Repo has been created already");
						errorLabel.setText(repos.getRepos().get(i).getRepoName() + " has been created already");
						errorLabel.setForeground(Color.RED);
						doesExist = true;
					}
				}
				if (!doesExist) {
					gitHubApiClient.createRepo(requestParams);
					System.out.println("Created repo named " + myRepoName);
				}
			}

		});

		// Adding rows to Panel
		lastRow.add(button);
		this.add(row1);
		this.add(row2);
		this.add(row5);
		this.add(lastRow);
		this.add(errorRow);

	}
}
