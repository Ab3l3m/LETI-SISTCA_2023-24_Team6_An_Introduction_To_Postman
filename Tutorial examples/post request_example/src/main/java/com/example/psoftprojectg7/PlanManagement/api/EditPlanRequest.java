package com.example.psoftprojectg7.PlanManagement.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditPlanRequest{

	@NotNull
	@NotBlank(message = "Please, insert the number of minutes")
	private String numberOfMinutes;
	@NotNull
	@NotBlank(message = "Please, insert a description")
	private String planDescription;
	@Min(0)
	@NotNull
	private int maxUsers;
	@Min(0)
	private int musicCollections;
	@NotBlank(message = "Please, insert a musicSuggestion")
	private String musicSuggestions;
	private double monthlyFee;
	private double annualFee;
	private boolean isActive;
	private boolean isPromoted;
	private boolean isArchived;


}
