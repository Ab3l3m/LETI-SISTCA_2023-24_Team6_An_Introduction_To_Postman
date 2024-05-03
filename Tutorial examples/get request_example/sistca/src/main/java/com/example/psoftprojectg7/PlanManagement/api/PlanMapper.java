package com.example.psoftprojectg7.PlanManagement.api;

import com.example.psoftprojectg7.PlanManagement.model.Plan;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public abstract class PlanMapper {

    public abstract Iterable<PlanDTO> toDTOList(Iterable<Plan> plans);

}
