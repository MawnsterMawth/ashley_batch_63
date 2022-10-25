package com.cogent.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.telecom.entity.CustomerCare;

public interface CustomerCareRepo extends JpaRepository<CustomerCare, Integer> {

}
