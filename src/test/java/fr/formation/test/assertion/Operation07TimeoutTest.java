
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.Random;

import org.junit.jupiter.api.Test;


public class Operation07TimeoutTest {
	

	
	@Test
	public void testTimeout() {
		System.out.println("testTimeout");
		long debut = System.currentTimeMillis();
		assertTimeout(Duration.ofMillis(250), () -> timeout(10000), () -> {
			long fin = System.currentTimeMillis();
			System.out.println("Timeout déclanché - temps de traitement : " + (fin - debut) + "ms");
			return "Timeout déclanché";
		});
	}	
	
	@Test
	public void testTimeoutPreemptively() {
		System.out.println("testTimeoutPreemptively");
		long debut = System.currentTimeMillis();
		assertTimeoutPreemptively(Duration.ofMillis(250), () -> timeout(10000), () -> {
			long fin = System.currentTimeMillis();
			System.out.println("Timeout Preemptively déclanché - temps de traitement : " + (fin - debut) + "ms");
			return "Timeout Preemptively déclanché";
		});
	}	
	
	
	
	private void timeout(int maxRandom)  {
		long time = new Random().nextInt(maxRandom);
		System.out.println("sleep " + time + " ms");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}


}
