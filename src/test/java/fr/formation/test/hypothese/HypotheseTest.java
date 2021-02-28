package fr.formation.test.hypothese;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class HypotheseTest {

	
	
	
	@Test
	public void test1(){
		boolean b = new Random().nextBoolean();
		int actual = new Random().nextInt(10);
		int expected = 5;
		assumeTrue(b);

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	public void test2(){
		boolean b = new Random().nextBoolean();
		int actual = new Random().nextInt(10);
		int expected = 5;
		assumeFalse(b, "false dans test2");

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	public void test3(){
		boolean b = new Random().nextBoolean();
		int actual = new Random().nextInt(10);
		int expected = 5;
		assumingThat(b, 
				()->{
					assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
				}
		);
	}
	
	
	
	@Test
	public void test11(){
		boolean b = new Random().nextBoolean();
		int actual = new Random().nextInt(10);
		int expected = 5;
		System.out.println("test1 : " + b);
		assumeTrue(b);

		System.out.println("actual : " + actual);
		System.out.println("expected : " + expected);
		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	public void test21(){
		boolean b = new Random().nextBoolean();
		int actual = new Random().nextInt(10);
		int expected = 5;
		System.out.println("test2 : " + b);
		assumingThat(b, 
				()->{
					System.out.println("actual : " + actual);
					System.out.println("expected : " + expected);
					assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
				}
		);
		
		
	}

	
}
