package com.cogent.Employees;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import com.cogent.spring.boot.controller.EmployeeController;

@SpringBootTest
class EmployeeManagementApplicationTests {

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
}
