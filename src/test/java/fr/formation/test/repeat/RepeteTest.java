package fr.formation.test.repeat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import fr.formation.test.Operation;

public class RepeteTest {

	private static Operation op;

	@BeforeAll
	private static void setUp() {
		op = new Operation();
	}

//	@RepeatedTest(5)
	public void test1() {
		int a = new Random().nextInt(100);
		int b = new Random().nextInt(100);
		int c = a + b;

		assertEquals(c, op.addition(a, b));
	}

	@DisplayName("Test 1 addition repété")
	@RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
	public void test2() {
		int a = new Random().nextInt(100);
		int b = new Random().nextInt(100);
		int c = a + b;

		assertEquals(c, op.addition(a, b));
	}

	@DisplayName("Test 2 addition repété")
	@RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
	public void test3() {
		int a = new Random().nextInt(100);
		int b = new Random().nextInt(100);
		int c = a + b;

		assertEquals(c, op.addition(a, b));
	}
	

	@DisplayName("Test 3 addition repété")
	@RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
	public void test4(RepetitionInfo info) {
		int a = new Random().nextInt(100);
		int b = new Random().nextInt(100);
		int c = a + b;
		
		int currentPos = info.getCurrentRepetition();
		int total = info.getTotalRepetitions();
		
		System.out.println("Test " + currentPos + " sur " + total + " : " + a + " + " + b );
		assertEquals(c, op.addition(a, b));
	}
	
	
}
