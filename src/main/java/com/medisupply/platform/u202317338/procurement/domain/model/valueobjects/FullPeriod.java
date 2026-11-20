package com.medisupply.platform.u202317338.procurement.domain.model.valueobjects;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record FullPeriod(LocalDate startDate, LocalDate endDate) {
    public FullPeriod {
        if (startDate == null) {
            throw new IllegalArgumentException("Period start date must not be null ");
        }

        if (endDate == null) {
            throw new IllegalArgumentException("Period start date must not be null ");
        }
        if (!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("Period start date must not be null ");
        }


    }
    public boolean contains(LocalDate checkDate){
        if (checkDate ==null)
        {
            throw new IllegalArgumentException("Checkdate must not be null ");

        }
        return !checkDate.isBefore(startDate) &&!checkDate.isAfter(endDate);
    }
}