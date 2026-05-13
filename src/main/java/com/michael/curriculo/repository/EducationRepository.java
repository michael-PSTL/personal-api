package com.michael.curriculo.repository;

import com.michael.curriculo.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Integer> {

    List<Education> findByIsActiveTrue();

}
