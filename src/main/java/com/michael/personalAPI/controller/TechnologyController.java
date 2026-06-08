package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.Technology;
import com.michael.personalAPI.repository.TechnologyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TechnologyController {

    private final TechnologyRepository technologyRepository;

    public TechnologyController(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @GetMapping("/technologies")
    public List<Technology> getTechnologies() {
        return technologyRepository.findAll();
    }
}