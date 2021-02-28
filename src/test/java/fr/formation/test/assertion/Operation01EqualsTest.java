
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.formation.test.Operation;


public class Operation01EqualsTest {
	
	private static Operation op;

	
	@BeforeAll
	public static void setUp() {
		op = new Operation();
	}
	
	@Test
	public void testEquals() {

		int expected = 5;
		int actual = op.addition(2, 3);

		assertEquals(expected, actual);
		
		assertEquals(expected, actual, "La somme doit retourner " + expected + " mais renvoie " + actual);
		
		assertEquals(expected, actual, () -> "La somme doit retourner " + expected + " mais renvoie " + actual);
		
		assertEquals(expected, actual, () -> {
			System.out.println("Concaténation executée uniquement si fail");
			return "La somme doit retourner " + expected + " mais renvoie " + actual;
		});
	}
	
	@Test
	public void testEqualsDouble() {

		double expected = 0.666;
		double actual = op.division(2, 3);
		double delta = 0.01;
				

		assertEquals(expected, actual);   // Fail

		assertEquals(expected, actual, delta);
		
		assertEquals(expected, actual, delta, "La somme doit retourner " + expected + " mais renvoie " + actual);
		
		assertEquals(expected, actual, delta, () -> "La somme doit retourner " + expected + " mais renvoie " + actual);

	}

}
