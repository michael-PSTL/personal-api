package com.michael.curriculo.controller;

import com.michael.curriculo.model.Education;
import com.michael.curriculo.repository.EducationRepository;
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