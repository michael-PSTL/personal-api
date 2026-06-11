package com.michael.personalAPI.integration.github;

import org.springframework.stereotype.Service;
import com.michael.personalAPI.integration.github.dto.GitHubRepositoryResponse;

@Service
public class GithubService {

    private final GithubClient gitHubClient;

    public GithubService(GithubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public GitHubRepositoryResponse[] listarRepositorios() {
        return gitHubClient.getRepositories("michael-PSTL");
    }
}
