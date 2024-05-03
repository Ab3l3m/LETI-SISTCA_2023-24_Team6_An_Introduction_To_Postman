package com.example.psoftprojectg7.PlanManagement.api;

import lombok.Data;

@Data
public class PlanDTO {

   
    private String planName;
    private String numberOfMinutes;
    private String planDescription;
    private int maxUsers;
    private int musicCollections;
    private String musicSuggestions;
    private double monthlyFee;
    private double annualFee;
    private boolean isActive;
    private boolean isPromoted;
    private boolean isArchived;
}


