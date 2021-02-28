package fr.formation.test.hypothese;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class HypotheseAnnotationTest {

	
	
	
	@Test
	@DisabledOnOs(OS.MAC)
	public void test1(){
		System.out.println("Test1");
		int actual = new Random().nextInt(10);
		int expected = new Random().nextInt(10);

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	@EnabledOnOs(OS.MAC)
	public void test2(){
		System.out.println("Test2");
		int actual = new Random().nextInt(10);
		int expected = new Random().nextInt(10);

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	@EnabledOnJre({JRE.JAVA_8, JRE.JAVA_9, JRE.JAVA_10, JRE.JAVA_11})
	public void test3(){
		System.out.println("Test3");
		int actual = new Random().nextInt(10);
		int expected = new Random().nextInt(10);

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	@Test
	@DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
	public void test4(){
		System.out.println("Test4");
		int actual = new Random().nextInt(10);
		int expected = new Random().nextInt(10);

		assertTrue(actual >= expected, ()->"" + actual + " n'est pas supérieur à " + expected);
	}

	
	
}
