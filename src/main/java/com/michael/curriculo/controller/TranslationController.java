package com.michael.curriculo.controller;

import com.michael.curriculo.model.Translation;
import com.michael.curriculo.repository.TranslationRepository;
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