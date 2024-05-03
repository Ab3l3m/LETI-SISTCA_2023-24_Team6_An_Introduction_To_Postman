package com.example.psoftprojectg7.PlanManagement.repositories;

import com.example.psoftprojectg7.PlanManagement.model.Plan;
import org.apache.el.stream.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PlanRepository extends CrudRepository<Plan, Long> {

        Optional<Plan> findById(Long planId);

        Plan findByPlanName(String planName);
        boolean existsByPlanName(String planName);

}
