package com.junit5.example;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
class OrderTestDemo {

	@Test
	@Order(3)
	void test1() {
		System.out.println("Test1");
	}

	@Test
	@Order(2)
	void test2() {
		System.out.println("test2");
	}

	@Test
	@Order(1)
	void test3() {
		System.out.println("test3");
	}
}
