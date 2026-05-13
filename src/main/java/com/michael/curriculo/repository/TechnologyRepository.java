package com.michael.curriculo.repository;

import com.michael.curriculo.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

    List<Technology> findByIsActiveTrue();

}