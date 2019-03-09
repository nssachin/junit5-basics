package com.junit5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Annotation Example")
//@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {

	Calculator calculator;
	/*
	 * Needs to be static else will throw JUnitException unless the class is annotated with
	 * @TestInstance(Lifecycle.PER_CLASS)
	 */
	@BeforeAll
	static void initAll() {
		System.out.println("init all!");
	}


	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("Some initializing code which needs to be executed before each @Test method");

	}

	@Test
	void testAddTwoNumbers() {
		assertEquals(3, calculator.add(1, 2));
	}

	@Test
	void testAddNegativeNumbers() {
		assertEquals(1, calculator.add(-1, 2));
	}
	
	@Test
	@Disabled("Yet to be implemented")
	void testMultipleNumbers() {
		fail("Yet to be implemented");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Post @Test method call!!");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("tear down all");
	}

}
