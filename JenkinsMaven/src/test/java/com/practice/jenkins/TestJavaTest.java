package com.practice.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJavaTest {

	@Test
	public void testAdd() {
		TestJava tj = new TestJava();
		assertEquals(20, tj.addNumbers(10, 10));
	}

	@Test
	public void testSubstract() {
		TestJava tj = new TestJava();
		assertEquals(0, tj.subNumber(10, 10));
	}
}
