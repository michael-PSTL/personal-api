package com.michael.personalAPI.controller;

import com.michael.personalAPI.integration.github.GithubService;
import com.michael.personalAPI.integration.github.dto.GitHubRepositoryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

    private final GithubService githubService;

    public GithubController(GithubService gitHubService) {
        this.githubService = gitHubService;
    }

    @GetMapping("/api/github/repos")
    public GitHubRepositoryResponse[] listarRepositorios() {
        return githubService.listarRepositorios();
    }
}
