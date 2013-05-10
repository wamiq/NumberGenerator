/**
 * 
 */
package com.valtech;

import org.junit.Test;

import com.valtech.interfaces.INumberGenerator;

import static org.junit.Assert.assertTrue;


/**
 * @author wamiq
 *
 */
public class NumberGeneratorTests{

	@Test
	public void TestGenerateRandomNumber(){
		
		INumberGenerator numberGenerator = new NumberGenerator();
		assertTrue(numberGenerator.getRandomNumber() < 100);
	}
	
}
