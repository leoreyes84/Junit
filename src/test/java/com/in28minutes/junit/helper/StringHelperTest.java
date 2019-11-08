package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@Before
	public void berfore() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		// AACD => CD; ACD => CD; CDEF => CDEF; CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		// AACD => CD; ACD => CD; CDEF => CDEF; CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		//ABCD => false; ABAB => true; AB => true, A => false.
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		//ABCD => false; ABAB => true; AB => true, A => false.
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
