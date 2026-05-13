package com.michael.curriculo.repository;

import com.michael.curriculo.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

    List<Language> findByIsActiveTrue();

}
