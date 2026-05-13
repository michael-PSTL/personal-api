package com.michael.curriculo.repository;

import com.michael.curriculo.model.Translation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<Translation, Integer> {
}
