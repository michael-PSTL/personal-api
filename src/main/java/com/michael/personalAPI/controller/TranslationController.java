package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.Translation;
import com.michael.personalAPI.repository.TranslationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TranslationController {

    private final TranslationRepository translationRepository;

    public TranslationController(TranslationRepository translationRepository){
        this.translationRepository = translationRepository;
    }

    @GetMapping("/translations")
    public List<Translation> getTranslations(){
        return translationRepository.findAll();
    }

}