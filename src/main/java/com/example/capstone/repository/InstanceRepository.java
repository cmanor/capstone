package com.example.capstone.repository;

import com.example.capstone.model.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstanceRepository extends JpaRepository <Instance, Long> {
}
