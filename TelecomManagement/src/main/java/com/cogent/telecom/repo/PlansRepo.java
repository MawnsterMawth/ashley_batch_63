package com.cogent.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.telecom.entity.Plans;

public interface PlansRepo extends JpaRepository<Plans, Integer> {

}
