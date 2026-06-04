package com.michael.personalAPI.repository;

import com.michael.personalAPI.model.ProfileText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileTextRepository extends JpaRepository<ProfileText, Integer> {

}