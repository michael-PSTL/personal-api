package com.michael.curriculo.controller;

import com.michael.curriculo.model.Language;
import com.michael.curriculo.repository.LanguageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    @GetMapping("/language")
    public List<Language> getLanguage(){
        return languageRepository.findByIsActiveTrue();
    }
}
