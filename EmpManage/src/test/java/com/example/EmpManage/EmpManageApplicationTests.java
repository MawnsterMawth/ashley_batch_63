package com.example.EmpManage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import com.example.EmpManage.controller.EmployeeController;

@SpringBootTest
class EmpManageApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void TestOne() {
		EmployeeController emp = new EmployeeController();
		assertEquals(11,emp.add(5,6));
	}
	
	@Test
	void TestTwo() {
		EmployeeController emp = new EmployeeController();
		assertEquals("playing ball",emp.play());
	}
	
	@AfterEach
	public void beforeTest() {
		System.out.println("Aster Test case it executes");
	}
}
