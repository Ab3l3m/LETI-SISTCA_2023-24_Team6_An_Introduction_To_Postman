package com.example.psoftprojectg7.PlanManagement.api;

import com.example.psoftprojectg7.PlanManagement.services.PlanService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plans")

public class PlanController {

    private final PlanService planService;

    private final PlanMapper planMapper;

    @Operation(summary = "Creates a new plan")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PlanDTO> createPlan(
            final HttpServletRequest request,
            @Valid @RequestBody final CreatePlanRequest resource) {
    
        final var plan = planService.createPlan(resource);

        return ResponseEntity.ok().eTag(Long.toString(plan.getVersion())).body(planMapper.toPlanDTO(plan));
    }
}