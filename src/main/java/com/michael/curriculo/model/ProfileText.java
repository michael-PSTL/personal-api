package com.michael.curriculo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "profile_texts")
public class ProfileText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_key")
    private String nameKey;

    @Column(name = "role_key")
    private String roleKey;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_key")
    private ProfileStatus statusKey;

    @Column(name = "objective_title_key")
    private String objectiveTitleKey;

    @Column(name = "objective_text_key")
    private String objectiveTextKey;

    @Column(name = "readme_key")
    private String readmeKey;

    @Column(name = "print_key")
    private String printKey;

    @Column(name = "qr_title_key")
    private String qrTitleKey;

    @Column(name = "qr_text_key")
    private String qrTextKey;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public ProfileText(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public ProfileStatus getStatusKey() {
        return statusKey;
    }

    public void setStatusKey(ProfileStatus statusKey) {
        this.statusKey = statusKey;
    }

    public String getObjectiveTitleKey() {
        return objectiveTitleKey;
    }

    public void setObjectiveTitleKey(String objectiveTitleKey) {
        this.objectiveTitleKey = objectiveTitleKey;
    }

    public String getObjectiveTextKey() {
        return objectiveTextKey;
    }

    public void setObjectiveTextKey(String objectiveTextKey) {
        this.objectiveTextKey = objectiveTextKey;
    }

    public String getReadmeKey() {
        return readmeKey;
    }

    public void setReadmeKey(String readmeKey) {
        this.readmeKey = readmeKey;
    }

    public String getPrintKey() {
        return printKey;
    }

    public void setPrintKey(String printKey) {
        this.printKey = printKey;
    }

    public String getQrTitleKey() {
        return qrTitleKey;
    }

    public void setQrTitleKey(String qrTitleKey) {
        this.qrTitleKey = qrTitleKey;
    }

    public String getQrTextKey() {
        return qrTextKey;
    }

    public void setQrTextKey(String qrTextKey) {
        this.qrTextKey = qrTextKey;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}