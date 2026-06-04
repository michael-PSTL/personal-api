package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.Competency;
import com.michael.personalAPI.repository.CompetencyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompetencyController {

    private final CompetencyRepository competencyRepository;

    public CompetencyController(CompetencyRepository competencyRepository){
        this.competencyRepository = competencyRepository;
    }

    @GetMapping("/competency")
    public List<Competency> getCompetency(){
        return competencyRepository.findByIsActiveTrue();
    }

}