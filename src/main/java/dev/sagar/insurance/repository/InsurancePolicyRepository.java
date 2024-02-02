package dev.sagar.insurance.repository;

import dev.sagar.insurance.model.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
}
