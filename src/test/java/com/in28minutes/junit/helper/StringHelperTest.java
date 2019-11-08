package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
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

}
