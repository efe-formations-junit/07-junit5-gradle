
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;


public class Operation08assertIterableEqualsTest {
	

	
	@Test
	public void testIterable1() {
		
		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterable<Integer> actual = new LinkedList<>(Arrays.asList(1, 2, 3));
		
		assertIterableEquals(expected, actual);  // OK
	}	
	
	@Test
	public void testIterable2() {
		
		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterable<Integer> actual = new LinkedList<>(Arrays.asList(1, 2));
		
		assertIterableEquals(expected, actual, ()->"Les deux listes n'ont pas exactement le même contenu");		// fail
	}	
	
	
	@Test
	public void testIterable3() {
		
		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterable<Integer> actual = new LinkedList<>(Arrays.asList(1, 3, 2));
		
		assertIterableEquals(expected, actual, ()->"Les deux listes n'ont pas exactement le même contenu");		// fail
	}	
	
	@Test
	public void testIterable4() {
		
		Iterable<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterable<Long> actual = new LinkedList<>(Arrays.asList(1L, 2L, 3L));
		
		assertIterableEquals(expected, actual, ()->"Les deux listes n'ont pas exactement le même contenu");		// fail
	}	
	



}
