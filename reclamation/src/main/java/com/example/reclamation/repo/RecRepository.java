package com.example.reclamation.repo;

import com.example.reclamation.entity.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecRepository extends JpaRepository<Reclamation, Long> {
}
