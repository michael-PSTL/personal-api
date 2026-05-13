package com.michael.curriculo.controller;

import com.michael.curriculo.model.Technology;
import com.michael.curriculo.repository.TechnologyRepository;
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
        return technologyRepository.findByIsActiveTrue();
    }
}