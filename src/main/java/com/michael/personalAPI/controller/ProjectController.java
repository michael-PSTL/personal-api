package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.Project;
import com.michael.personalAPI.repository.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @GetMapping("/project")
    public List<Project> getProject(){
        return projectRepository.findAll();
    }

}
