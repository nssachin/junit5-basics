package com.junit5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class AssumptionsDemo {

	Calculator calculator = new Calculator();

	@Test
	void testStandardAssumption() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertEquals(3, calculator.add(1, 2));
	}

	@Test
	@EnabledOnJre(JRE.JAVA_13)
	void testOnlyOnDeveloperEnv() {
		assumeTrue("DEV".equals(System.getProperty("ENV")), "Not a Dev env.");
		assertEquals(3, calculator.add(1, 2));
	}

}
