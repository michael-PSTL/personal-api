package com.michael.curriculo.controller;

import com.michael.curriculo.model.ProfileText;
import com.michael.curriculo.repository.ProfileTextRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileTextController {

    private final ProfileTextRepository profileTextRepository;

    public ProfileTextController(ProfileTextRepository profileTextRepository) {
        this.profileTextRepository = profileTextRepository;
    }

    @GetMapping("/profiletext")
    public List<ProfileText> getProfileText() {
        return profileTextRepository.findAll();
    }

}