package com.example.psoftprojectg7.PlanManagement.services;


import com.example.psoftprojectg7.PlanManagement.model.Plan;
import com.example.psoftprojectg7.PlanManagement.repositories.PlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanServiceImp implements PlanService {

    private final PlanRepository repository;

    @Override
    public Iterable<Plan> findAll() {
        return repository.findAll();
    }
}

