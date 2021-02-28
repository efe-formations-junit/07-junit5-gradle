
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.formation.test.Operation;
import fr.formation.test.exception.OperationException;


public class Operation06ThrowsTest {
	
	private static Operation op;

	
	@BeforeAll
	public static void setUp() {
		op = new Operation();
	}
	
	@Test
	public void testThrows() {
		
		assertThrows(OperationException.class, ()->op.division(5, 0));
		
		assertThrows(OperationException.class, ()->op.division(5, 0), "Une OperationException devrait être renvoyée");

		assertThrows(OperationException.class, ()->op.division(5, 0), () -> "Une OperationException devrait être renvoyée");
	}	
	

	@Test
	public void testDoesNotThrows() {
		
		assertDoesNotThrow(()->op.division(5, 1));
		
		assertDoesNotThrow(()->op.division(5, 1), "Une OperationException devrait être renvoyée");

		assertDoesNotThrow(()->op.division(5, 1), () -> "Une OperationException devrait être renvoyée");
	}	
	



}
