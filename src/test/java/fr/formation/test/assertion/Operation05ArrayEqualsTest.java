
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class Operation05ArrayEqualsTest {
	

	@Test
	public void testArrayEquals() {
		
		char[]expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
	    char[]actual = "Jupiter".toCharArray();
	
	    
	    assertArrayEquals(expected, actual);
		
	    assertArrayEquals(expected, actual, "Les deux tableaux doivent être identiques");
		
	    assertArrayEquals(expected, actual, () -> "Les deux tableaux doivent être identiques");	
	}	
	
	@Test
	public void testArrayEquals2() {
		
		String[]expected = { new String ("A"), new String("B") };
		String[]actual   = { new String ("A"), new String("B") };
	
	    
	    assertArrayEquals(expected, actual);
		
	    assertArrayEquals(expected, actual, "Les deux tableaux doivent être identiques");
		
	    assertArrayEquals(expected, actual, () -> "Les deux tableaux doivent être identiques");	
	}	

	


}
