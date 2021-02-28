package fr.formation.test.dynamic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import fr.formation.test.Operation;

public class MyDynamicTest {

	private static Operation op;

	@BeforeAll
	private static void setUp() {
		op = new Operation();
	}

	@TestFactory
	public Iterable<DynamicTest> testDynamic() {
		List<DynamicTest> resultat = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int val = i;
			resultat.add(DynamicTest.dynamicTest("Addition " + val + "+" + val,
					() -> assertEquals(val * 2, op.addition(val, val))));
		}
		return resultat;
	}

	@TestFactory
	Stream<DynamicTest> dynamicTestsAvecStream() {
		return IntStream
				.rangeClosed(0, 4)
				.mapToObj(
				val -> DynamicTest.dynamicTest("Addition " + val + "+" + val, 
						() -> assertEquals(val * 2, op.addition(val, val))));
	}
}
