package com.michael.curriculo.repository;

import com.michael.curriculo.model.Competency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetencyRepository extends JpaRepository<Competency,Integer> {

    List<Competency> findByIsActiveTrue();

}
