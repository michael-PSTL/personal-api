package com.michael.curriculo.repository;

import com.michael.curriculo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

    List<Project> findByIsActiveTrue();

}
