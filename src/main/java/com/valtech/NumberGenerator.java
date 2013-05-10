package com.valtech;

import com.valtech.interfaces.INumberGenerator;
import java.util.Random;

public class NumberGenerator implements INumberGenerator {

	@Override
	public int getRandomNumber() {
		return (new Random()).nextInt(100); 
	}

}
