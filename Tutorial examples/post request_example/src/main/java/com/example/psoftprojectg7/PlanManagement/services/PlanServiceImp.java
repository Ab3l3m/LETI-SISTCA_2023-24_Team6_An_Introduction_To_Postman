package com.example.psoftprojectg7.PlanManagement.services;


import com.example.psoftprojectg7.PlanManagement.api.CreatePlanRequest;
import com.example.psoftprojectg7.PlanManagement.api.PlanMapper;
import com.example.psoftprojectg7.PlanManagement.model.Plan;
import com.example.psoftprojectg7.PlanManagement.repositories.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PlanServiceImp implements PlanService {


    private PlanRepository repository;
    private EditPlanMapper planEditMapper;

    @Autowired
    public void PlanServiceImpl(PlanRepository planRepository, EditPlanMapper planEditMapper, PlanMapper mapper) {
        this.repository = planRepository;
        this.planEditMapper = planEditMapper;

    }
    @Override
    @Transactional
    public Plan createPlan(final CreatePlanRequest resource) {
        if (repository.existsByPlanName(resource.getPlanName())) {
            throw new IllegalArgumentException("A plan with the provided name already exists.");
        }
        final Plan plan = planEditMapper.create(resource);

        return repository.save(plan);
    }
}
