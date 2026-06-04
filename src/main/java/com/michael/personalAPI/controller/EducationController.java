package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.Education;
import com.michael.personalAPI.repository.EducationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {

    private final EducationRepository educationRepository;

    public EducationController(EducationRepository educationRepository){
        this.educationRepository = educationRepository;
    }

    @GetMapping("/education")
    public List<Education> getEducation(){
        return educationRepository.findByIsActiveTrue();
    }

}