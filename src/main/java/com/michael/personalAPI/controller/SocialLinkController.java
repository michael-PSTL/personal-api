package com.michael.personalAPI.controller;

import com.michael.personalAPI.model.SocialLink;
import com.michael.personalAPI.repository.SocialLinkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialLinkController {

    private final SocialLinkRepository socialLinkRepository;

    public SocialLinkController(SocialLinkRepository socialLinkRepository){
        this.socialLinkRepository = socialLinkRepository;
    }

    @GetMapping("/sociallinks")
    public List<SocialLink> getSocialLinks(){
        return socialLinkRepository.findByIsActiveTrue();
    }
}