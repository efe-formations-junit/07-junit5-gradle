
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;


public class Operation04SameTest {

	
	@Test
	public void testSame() {
		String s1 = "A";
		String s2 = "A";

		assertSame(s1, s2);
		
		assertSame(s1, s2, "s1 et s2 doivent représenter le même objet en mémoire");
		
		assertSame(s1, s2, () -> "s1 et s2 doivent représenter le même objet en mémoire");	
	}	
	
	@Test
	public void testSame2() {
		String s1 = new String("A");
		String s2 = new String("A");

		assertSame(s1, s2);
		
		assertSame(s1, s2, "s1 et s2 doivent représenter le même objet en mémoire");
		
		assertSame(s1, s2, () -> "s1 et s2 doivent représenter le même objet en mémoire");	
	}	
	
	
	


}
