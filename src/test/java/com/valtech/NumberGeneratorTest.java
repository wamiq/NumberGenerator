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
		assertTrue(numberGenerator.getRandomNumber() < 100);
	}

}
