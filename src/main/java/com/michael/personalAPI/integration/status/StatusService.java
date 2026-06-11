package com.michael.personalAPI.integration.status;

import com.michael.personalAPI.integration.github.GithubService;
import com.michael.personalAPI.integration.status.dto.StatusResponse;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    private final GithubService githubService;
    private final DeveloperExperience developerExperience;

    public StatusService(
            GithubService githubService,
            DeveloperExperience developerExperience
    ) {
        this.githubService = githubService;
        this.developerExperience = developerExperience;
    }

    public StatusResponse getStatus() {
        return new StatusResponse(
                githubService.contarRepositorios(),
                developerExperience.getExperience()
        );
    }
}