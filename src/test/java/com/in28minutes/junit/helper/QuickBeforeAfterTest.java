package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void before() {
		System.out.println("before test");
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test 2 executed");
	}

	@After
	public void after() {
		System.out.println("after test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

}
