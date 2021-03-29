package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;


import org.junit.Test;

public class MyAddMethodsTest {
	MyAddMethods mam = new MyAddMethods();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(MyAddMethods.class.getName());

	@Test
	public void test() {
		int tempRandomValue = 0;
		int tempResult = 0;
		for (int i = 0; i < 5; i ++) {
			tempRandomValue = random.nextInt();
			tempResult = tempRandomValue + 1;
			LOG.info("Testing the method add with: " + tempRandomValue);
			assertEquals(mam.add1(tempRandomValue), tempResult);
		}
	}

}
