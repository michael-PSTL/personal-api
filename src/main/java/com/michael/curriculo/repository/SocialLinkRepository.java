package com.michael.curriculo.repository;

import com.michael.curriculo.model.SocialLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SocialLinkRepository extends JpaRepository<SocialLink,Integer> {

    List<SocialLink> findByIsActiveTrue();

}
