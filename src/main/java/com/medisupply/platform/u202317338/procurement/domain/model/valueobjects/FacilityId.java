package com.medisupply.platform.u202317338.procurement.domain.model.valueobjects;
import java.util.UUID;

public record FacilityId(UUID value) {
    public FacilityId
    {
        if (value == null)
        {
            throw new IllegalArgumentException("Facility id must not be null");
        }
    }

    public  FacilityId(String addValue){
        this (parseUUID(addValue));
    }
    private static UUID parseUUID(String addValue){
        if (addValue == null || addValue.isBlank()){
          throw  new IllegalArgumentException("Facility id must not be null") ;

        }
        try{
           return  UUID.fromString(addValue.trim());
        }catch (IllegalArgumentException ex)
        {
            throw new IllegalArgumentException("Facility id must be a valid UUID");

        }
    }

}
