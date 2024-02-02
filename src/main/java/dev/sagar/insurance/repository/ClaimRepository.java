package dev.sagar.insurance.repository;

import dev.sagar.insurance.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
