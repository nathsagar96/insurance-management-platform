package dev.sagar.insurance.dto;

import java.time.LocalDate;

public record InsurancePolicyDTO(String policyNumber, String type, Double coverageAmount, Double premium,
                                 LocalDate startDate, LocalDate endDate, Long clientId) {
}
