package com.calculator.maven._pass_emelieSannerfeltSaraChristensen;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator advancedCalculator = new AdvancedCalculator();

	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	// CUBE

	@Test
	public void testCubePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1 * tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.cube(tempRandomValue1), tempResult, 0);
		}

	}

	@Test
	public void testCubeNegative() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 * tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.cube(tempRandomValue1), tempResult, 0);
		}

	}

	// SQUARE

	@Test
	public void testSquarePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.square(tempRandomValue1), tempResult, 0);
		}

	}

	@Test
	public void testSquareNegative() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * -1;
			tempResult = tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.square(tempRandomValue1), tempResult, 0);
		}

	}

//SQAURE ROOT

	@Test
	public void testSquareRootPositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.squareRoot(tempRandomValue1), tempResult, 0);
		}

	}

	// ABSOLUTE VALUE
	@Test
	public void testAbsoluteValuePositive() {
		double tempRandomValue1 = 0;
		double tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble();
			tempResult = tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.absoluteValue(tempRandomValue1), tempResult, 0);
		}

	}

	// RAISED TO THE POWER OF

	@Test
	public void testRaisedToThePowerOfPositive() {
		int tempRandomValue1 = 0;
		int tempResult = 0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextInt();
			tempResult = tempRandomValue1;
			LOG.info("Testing the method add with: " + tempRandomValue1);
			assertEquals(advancedCalculator.raisedToThePowerOf(tempRandomValue1), tempResult, 0);
		}

	}

}
