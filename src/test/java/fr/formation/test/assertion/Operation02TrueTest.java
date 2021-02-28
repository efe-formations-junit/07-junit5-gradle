
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.formation.test.Operation;


public class Operation02TrueTest {
	
	private static Operation op;

	
	@BeforeAll
	public static void setUp() {
		op = new Operation();
	}
	
	@Test
	public void testTrue() {

		int expected = 5;
		int actual = op.addition(2, 3);

		assertTrue(expected == actual);
		
		assertTrue(expected == actual, "La somme doit retourner " + expected + " mais renvoie " + actual);
		
		assertTrue(expected == actual, () -> "La somme doit retourner " + expected + " mais renvoie " + actual);	
	}	
	
	
	
	@Test
	public void testTrue2() {

		int expected = 6;
		int actual = op.addition(2, 3);

		BooleanSupplier additionTest = () -> expected == actual;
		
		assertTrue(additionTest);
		
		assertTrue(additionTest, "La somme doit retourner " + expected + " mais renvoie " + actual);
		
		assertTrue(additionTest, () -> "La somme doit retourner " + expected + " mais renvoie " + actual);	
	}
	

}
