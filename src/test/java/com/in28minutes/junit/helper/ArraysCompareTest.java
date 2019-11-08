package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);

		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int numbers[] = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testArrayPerformance() {
		int[] array = { 1, 4, 8 };
		for(int i = 0; i<100000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
