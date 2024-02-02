package dev.sagar.insurance.controller;

import dev.sagar.insurance.dto.ClaimDTO;
import dev.sagar.insurance.model.Claim;
import dev.sagar.insurance.service.ClaimService;
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
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping
    public ResponseEntity<List<Claim>> getAllClaims() {
        List<Claim> claims = claimService.getAllClaims();
        return ResponseEntity.ok(claims);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Claim> getClaimById(@PathVariable Long id) {
        Claim claim = claimService.getClaimById(id);
        return ResponseEntity.ok(claim);
    }

    @PostMapping
    public ResponseEntity<Claim> createClaim(@RequestBody ClaimDTO claimDTO) {
        Claim createdClaim = claimService.createClaim(claimDTO);
        return ResponseEntity.ok(createdClaim);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Claim> updateClaim(@PathVariable Long id, @RequestBody ClaimDTO claimDTO) {
        Claim updatedClaim = claimService.updateClaim(id, claimDTO);
        return ResponseEntity.ok(updatedClaim);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClaim(@PathVariable Long id) {
        claimService.deleteClaim(id);
        return ResponseEntity.noContent().build();
    }
}
