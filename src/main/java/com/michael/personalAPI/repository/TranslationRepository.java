package com.michael.personalAPI.repository;

import com.michael.personalAPI.model.Translation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<Translation, Integer> {
}
