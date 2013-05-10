package com.valtech;

import com.valtech.interfaces.INumberGenerator;
import java.util.Random;

public class NumberGenerator implements INumberGenerator {

	@Override
	public int getRandomNumber(int seedValue) {
		return (new Random()).nextInt(seedValue); 
	}

}
