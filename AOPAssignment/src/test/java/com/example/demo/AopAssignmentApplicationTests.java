package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopAssignmentApplicationTests {
	@Autowired
	Example e;

	@Test
	void contextLoads() {
	}

	@Test
	public void test1BeforePointcut() {
		e.fatima();
		System.out.println();
	}

	@Test
	public void testAfterPointcut() {
		e.nihal();
		System.out.println();
	}

	@Test
	public void testAroundPointcut() {
		e.miral();
		System.out.println();
	}
	@Test
	public void testAfterReturningPointcut() {
		e.wassim();
		System.out.println();
	}
	@Test
	public void testAfterThrowingPointcut(){
		try {
			e.khalid();
		} catch (Exception e) {
		}
		System.out.println();
	}
}
