package com.michael.personalAPI.repository;

import com.michael.personalAPI.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

    List<Technology> findByIsActiveTrue();

}