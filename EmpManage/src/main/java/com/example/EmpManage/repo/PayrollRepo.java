package com.example.EmpManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpManage.entity.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll, Integer>{
	
}
