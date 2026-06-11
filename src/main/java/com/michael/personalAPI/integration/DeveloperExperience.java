package com.michael.personalAPI.integration;

import java.time.LocalDate;
import java.time.Period;

public class DeveloperExperience {

    private static final LocalDate DEVELOPER_SINCE =
            LocalDate.of(2025, 8, 16);

    public String getExperience() {
        Period period = Period.between(DEVELOPER_SINCE, LocalDate.now());

        return period.getYears() + " anos e " +
               period.getMonths() + " meses";
    }
}