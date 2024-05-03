package com.example.psoftprojectg7.PlanManagement.api;

import com.example.psoftprojectg7.PlanManagement.services.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import com.example.psoftprojectg7.PlanManagement.model.Plan;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plans")
public class PlanController {

    private final PlanService planService;
    private final PlanMapper planMapper;

    @GetMapping
    public Iterable<PlanDTO> getAllPlans(HttpServletRequest request) {
        Iterable<Plan> plans = planService.findAll();
        return planMapper.toDTOList(plans);
    }
}
