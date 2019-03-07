package com.junit5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testHelloWorld() {
		assertEquals("Hello World", "Hello World", "First Hello World JUnit5 test case");
	}
}
