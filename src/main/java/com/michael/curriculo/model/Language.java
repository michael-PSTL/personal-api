package com.michael.curriculo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "language_key", unique = true)
    private String languageKey;

    @Column(name = "level_key")
    private String levelKey;

    @Column(name = "is_active")
    private Boolean isActive;

    public Language() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getLevelKey() {
        return levelKey;
    }

    public void setLevelKey(String levelKey) {
        this.levelKey = levelKey;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}