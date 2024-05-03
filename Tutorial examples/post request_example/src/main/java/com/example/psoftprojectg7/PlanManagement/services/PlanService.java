package com.example.psoftprojectg7.PlanManagement.services;


import com.example.psoftprojectg7.PlanManagement.api.CreatePlanRequest;
import com.example.psoftprojectg7.PlanManagement.model.Plan;

public interface PlanService {

    Plan createPlan(CreatePlanRequest resource);

}
