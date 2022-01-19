package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.Goldilocks;

public class GoldilocksTest {

	@Test
	public void test100_120() {
		assertEquals("1, 3, 9, 19, 22", Goldilocks.goldilocks(100, 120));
	}

	@Test
	public void test130_90() {
		assertEquals("1", Goldilocks.goldilocks(130, 90));
	}

	@Test
	public void test90_130() {
		assertEquals("1, 3, 5, 9, 12, 16, 19, 20, 22, 25, 27, 29", Goldilocks.goldilocks(90, 130));
	}

	@Test
	public void test100_120_70() {
		assertEquals("3, 9, 19, 22", Goldilocks.luminosity(100, 120, 70));
	}

}
