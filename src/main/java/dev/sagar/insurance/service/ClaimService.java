package dev.sagar.insurance.service;

import dev.sagar.insurance.dto.ClaimDTO;
import dev.sagar.insurance.model.Claim;
import dev.sagar.insurance.model.InsurancePolicy;
import dev.sagar.insurance.repository.ClaimRepository;
import dev.sagar.insurance.repository.InsurancePolicyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private InsurancePolicyRepository policyRepository;

    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    public Claim getClaimById(Long id) {
        return claimRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Claim not found with id: " + id));
    }

    public Claim createClaim(ClaimDTO claimDTO) {
        Claim claim = new Claim();
        claim.setClaimNumber(claimDTO.claimNumber());
        claim.setDescription(claimDTO.description());
        claim.setClaimDate(claimDTO.claimDate());
        claim.setClaimStatus(claimDTO.claimStatus());

        InsurancePolicy policy = policyRepository.findById(claimDTO.policyId())
                .orElseThrow(() -> new EntityNotFoundException("Policy not found with id: " + claimDTO.policyId()));

        claim.setInsurancePolicy(policy);
        return claimRepository.save(claim);
    }

    public Claim updateClaim(Long id, ClaimDTO claimDTO) {
        Claim existingClaim = getClaimById(id);
        existingClaim.setClaimNumber(claimDTO.claimNumber());
        existingClaim.setDescription(claimDTO.description());
        existingClaim.setClaimDate(claimDTO.claimDate());
        existingClaim.setClaimStatus(claimDTO.claimStatus());

        InsurancePolicy policy = policyRepository.findById(claimDTO.policyId())
                .orElseThrow(() -> new EntityNotFoundException("Policy not found with id: " + claimDTO.policyId()));

        existingClaim.setInsurancePolicy(policy);
        return claimRepository.save(existingClaim);
    }

    public void deleteClaim(Long id) {
        Claim claim = getClaimById(id);
        claimRepository.delete(claim);
    }
}
