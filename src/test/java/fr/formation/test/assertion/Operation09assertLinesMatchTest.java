
package fr.formation.test.assertion;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Operation09assertLinesMatchTest {
	

	
	@Test
	public void testLinesMatch1() {
		List<String> expected = Arrays.asList("A", "B", "C");
	    List<String> actual = Arrays.asList("A", "B", "C");
	    
	    Assertions.assertLinesMatch(expected, actual); // OK
	}	
	
	@Test
	public void testLinesMatch2() {
		List<String> expected = Arrays.asList("(.*)@(.*)", "(.*)@(.*)");
	    List<String> actual = Arrays.asList("form@ation.com", "java@test.fr");
	    
	    Assertions.assertLinesMatch(expected, actual); // OK
	}	
	
	
	@Test
	public void testLinesMatch3() {
		List<String> expectedPers = Arrays.asList("\\D*", "\\D*", "\\d*");
	    List<String> actualPers = Arrays.asList("Legrand", "Jean", "35");
	    
	    Assertions.assertLinesMatch(expectedPers, actualPers); // OK
	}	
	
	@Test
	public void testLinesMatch4() {
		List<String> expectedPers = Arrays.asList("A", ">>1>>", "C");
	    List<String> actualPers1 = Arrays.asList("A", "B", "C");
	    List<String> actualPers2 = Arrays.asList("A", "45", "C");
	    List<String> actualPers3 = Arrays.asList("A", "Hello World", "C");
	    List<String> actualPers4 = Arrays.asList("A", null, "C");
	    
	    Assertions.assertLinesMatch(expectedPers, actualPers1); // OK
	    Assertions.assertLinesMatch(expectedPers, actualPers2); // OK
	    Assertions.assertLinesMatch(expectedPers, actualPers3); // OK
	    Assertions.assertLinesMatch(expectedPers, actualPers4); // Fail
	}	
	
	
	@Test
	public void testLinesMatch5() {
		List<String> expectedPers = Arrays.asList("A", ">> Saut >>", "C");
	    List<String> actualPers1 = Arrays.asList("A", "B1", "B2", "B3", "C");
	    List<String> actualPers2 = Arrays.asList("A", "45", "C");
	    List<String> actualPers3 = Arrays.asList("A", "C");
	    
	    Assertions.assertLinesMatch(expectedPers, actualPers1); // OK
	    Assertions.assertLinesMatch(expectedPers, actualPers2); // OK
	    Assertions.assertLinesMatch(expectedPers, actualPers3); // fail
	}	
	

}
