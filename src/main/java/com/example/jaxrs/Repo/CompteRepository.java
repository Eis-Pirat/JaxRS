package com.example.jaxrs.Repo;

import com.example.jaxrs.Models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
