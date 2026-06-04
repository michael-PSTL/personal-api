package com.michael.personalAPI.repository;

import com.michael.personalAPI.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

    List<Language> findByIsActiveTrue();

}
