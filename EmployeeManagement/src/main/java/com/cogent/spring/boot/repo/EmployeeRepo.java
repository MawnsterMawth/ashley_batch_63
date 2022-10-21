package com.cogent.spring.boot.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.boot.entity.EmployeeEntity;

@Repository
public class EmployeeRepo {

	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static EmployeeEntity getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(EmployeeEntity employees) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int empId) {
		// TODO Auto-generated method stub
		
	}

}
