
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.formation.test.Operation;


public class Operation03NullTest {
	
	private static Operation op;

	
	@BeforeAll
	public static void setUp() {
		op = new Operation();
	}
	
	@Test
	public void testTrue() {

		String ok = (op != null) ? null : "op != null";

		assertNull(ok);
		
		assertNull(ok, "La chaine devrait être nulle");
		
		assertNull(ok, () -> "La chaine devrait être nulle");	
	}	
	
	
	


}
