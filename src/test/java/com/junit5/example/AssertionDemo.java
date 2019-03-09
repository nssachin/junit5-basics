package com.junit5.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	Calculator calculator;

	@BeforeEach
	void init() {
		calculator = new Calculator();
	}

	@Test
	void standardAssertion() {
		assertEquals(3, calculator.add(1, 2), "Custome message is now the last parameter unlike the first param in junit4");
	}

	@Test
	void testAssertionMessageUsingLamda() {
		assertEquals(3, calculator.add(1, 2), () -> "This message is now lazily evaluated unlike the previous method");
	}

	@Test
	void testGroupedAssertions() {
		assertAll("Calculator Group Assertion failed",
				() -> assertEquals(3, calculator.add(1, 2)),
				() -> assertEquals(1, calculator.add(-1, 2))
				)	;

	}
}
