package com.michael.curriculo.controller;

import com.michael.curriculo.model.Project;
import com.michael.curriculo.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
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
        return projectRepository.findByIsActiveTrue();
    }

}
