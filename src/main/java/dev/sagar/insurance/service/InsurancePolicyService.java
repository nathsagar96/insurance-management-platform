package dev.sagar.insurance.service;

import dev.sagar.insurance.dto.InsurancePolicyDTO;
import dev.sagar.insurance.model.Client;
import dev.sagar.insurance.model.InsurancePolicy;
import dev.sagar.insurance.repository.ClientRepository;
import dev.sagar.insurance.repository.InsurancePolicyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsurancePolicyService {

    @Autowired
    private InsurancePolicyRepository policyRepository;

    @Autowired
    private ClientRepository clientRepository;

    public List<InsurancePolicy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public InsurancePolicy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Policy not found with id: " + id));
    }

    public InsurancePolicy createPolicy(InsurancePolicyDTO policyDTO) {
        InsurancePolicy policy = new InsurancePolicy();
        policy.setPolicyNumber(policyDTO.policyNumber());
        policy.setType(policyDTO.type());
        policy.setCoverageAmount(policyDTO.coverageAmount());
        policy.setPremium(policyDTO.premium());
        policy.setStartDate(policyDTO.startDate());
        policy.setEndDate(policyDTO.endDate());

        Client client = clientRepository.findById(policyDTO.clientId())
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + policyDTO.clientId()));

        policy.setClient(client);
        return policyRepository.save(policy);
    }

    public InsurancePolicy updatePolicy(Long id, InsurancePolicyDTO policyDTO) {
        InsurancePolicy existingPolicy = getPolicyById(id);
        existingPolicy.setPolicyNumber(policyDTO.policyNumber());
        existingPolicy.setType(policyDTO.type());
        existingPolicy.setCoverageAmount(policyDTO.coverageAmount());
        existingPolicy.setPremium(policyDTO.premium());
        existingPolicy.setStartDate(policyDTO.startDate());
        existingPolicy.setEndDate(policyDTO.endDate());

        Client client = clientRepository.findById(policyDTO.clientId())
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + policyDTO.clientId()));

        existingPolicy.setClient(client);
        return policyRepository.save(existingPolicy);
    }

    public void deletePolicy(Long id) {
        InsurancePolicy policy = getPolicyById(id);
        policyRepository.delete(policy);
    }
}
