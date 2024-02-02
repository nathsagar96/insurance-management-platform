package dev.sagar.insurance.repository;

import dev.sagar.insurance.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
