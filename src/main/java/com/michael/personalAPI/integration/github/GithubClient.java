package com.michael.personalAPI.integration.github;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.michael.personalAPI.integration.github.dto.GitHubRepositoryResponse;

@Service
public class GithubClient {

    private final RestClient restClient;

    public GithubClient(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://api.github.com")
                .build();
    }

    public GitHubRepositoryResponse[] getRepositories(String username) {
        return restClient.get()
                .uri("/users/{username}/repos", username)
                .retrieve()
                .body(GitHubRepositoryResponse[].class);
    }
}
