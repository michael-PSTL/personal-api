package com.michael.personalAPI.repository;

import com.michael.personalAPI.model.SocialLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SocialLinkRepository extends JpaRepository<SocialLink,Integer> {

}
