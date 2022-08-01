package com.example.capstone.repository;

import com.example.capstone.model.Iteration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IterationRepository extends JpaRepository <Iteration, Long> {
}
