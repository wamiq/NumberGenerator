/**
 * 
 */
package com.valtech;

import static org.junit.Assert.*;
import org.junit.Test;

import com.valtech.interfaces.INumberGenerator;

/**
 * @author wamiq
 * 
 */
public class NumberGeneratorTest{
	/*
	 *
	 */
	@Test
	public void testGenerateRandomNumber() {
		INumberGenerator numberGenerator = new NumberGenerator();
		final int SEED_VALUE = 100;
		assertTrue(numberGenerator.getRandomNumber(SEED_VALUE) < SEED_VALUE);
	}

}
