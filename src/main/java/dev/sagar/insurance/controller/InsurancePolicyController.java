package dev.sagar.insurance.controller;

import dev.sagar.insurance.dto.InsurancePolicyDTO;
import dev.sagar.insurance.model.InsurancePolicy;
import dev.sagar.insurance.service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class InsurancePolicyController {

    @Autowired
    private InsurancePolicyService insurancePolicyService;

    @GetMapping
    public ResponseEntity<List<InsurancePolicy>> getAllPolicies() {
        List<InsurancePolicy> policies = insurancePolicyService.getAllPolicies();
        return ResponseEntity.ok(policies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsurancePolicy> getPolicyById(@PathVariable Long id) {
        InsurancePolicy policy = insurancePolicyService.getPolicyById(id);
        return ResponseEntity.ok(policy);
    }

    @PostMapping
    public ResponseEntity<InsurancePolicy> createPolicy(@RequestBody InsurancePolicyDTO policyDTO) {
        InsurancePolicy createdPolicy = insurancePolicyService.createPolicy(policyDTO);
        return ResponseEntity.ok(createdPolicy);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InsurancePolicy> updatePolicy(@PathVariable Long id, @RequestBody InsurancePolicyDTO policyDTO) {
        InsurancePolicy updatedPolicy = insurancePolicyService.updatePolicy(id, policyDTO);
        return ResponseEntity.ok(updatedPolicy);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePolicy(@PathVariable Long id) {
        insurancePolicyService.deletePolicy(id);
        return ResponseEntity.noContent().build();
    }
}
