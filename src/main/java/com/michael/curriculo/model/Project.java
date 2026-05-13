package com.michael.curriculo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title_key")
    private String titleKey;

    private String url;

    @Column(name = "is_active")
    private Boolean isActive;

    public Project(){
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitleKey(){
        return titleKey;
    }

    public void setTitleKey(String titleKey){
        this.titleKey = titleKey;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public Boolean getIsActive(){
        return isActive;
    }

    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }

}
