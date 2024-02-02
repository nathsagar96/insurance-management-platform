package dev.sagar.insurance.dto;

import java.time.LocalDate;

public record ClaimDTO(String claimNumber, String description, LocalDate claimDate, String claimStatus, Long policyId) {
}
