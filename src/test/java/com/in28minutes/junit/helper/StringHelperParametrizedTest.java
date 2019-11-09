package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	static StringHelper helper;

	@BeforeClass
	public static void berfore() {
		helper = new StringHelper();
	}

	String input;
	String expectedOutput;

	public StringHelperParametrizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		// AACD => CD; ACD => CD; CDEF => CDEF; CDAA => CDAA
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
