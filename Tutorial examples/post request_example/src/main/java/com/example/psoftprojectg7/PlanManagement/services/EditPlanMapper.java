package com.example.psoftprojectg7.PlanManagement.services;

import com.example.psoftprojectg7.PlanManagement.api.CreatePlanRequest;
import com.example.psoftprojectg7.PlanManagement.model.Plan;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring")
public abstract class EditPlanMapper {

    public abstract Plan create(CreatePlanRequest request);
}

