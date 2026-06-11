package com.michael.personalAPI.integration.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubRepositoryResponse {

    private String name;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("stargazers_count")
    private int stargazersCount;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }
    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }
}