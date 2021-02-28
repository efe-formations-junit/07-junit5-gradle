package fr.formation.test.param;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import fr.formation.test.Operation;

public class ParamTest {

	private static Operation op;

	@BeforeAll
	private static void setUp() {
		op = new Operation();
	}

	
	@ParameterizedTest
	@ValueSource(ints = {4, 5, 9})
	public void testParamEnDur(int param1) {
		assertEquals(2 * param1, op.addition(param1, param1));
	}
	
	@ParameterizedTest
	@CsvSource(value =  {"4, 5, 9", "9, -4, 5", "102, -203, -101"})
	public void testParamParCsv(int param1, int param2, int expected) {
		assertEquals(expected, op.addition(param1, param2));
	}

	
	
	@ParameterizedTest
	@CsvFileSource(resources = "/params.csv")
	public void testParamParFichierCsv(int param1, int param2, int expected) {
		assertEquals(expected, op.addition(param1, param2));
	}

	@ParameterizedTest
	@MethodSource("getFluxDEntiers")
	public void testParamMethodSource1(int param1) {
		assertEquals(2 * param1, op.addition(param1, param1));
	}

	
	private static IntStream getFluxDEntiers() {
		return IntStream.of(8, -6, 96, 0, 78);
	}
	

	
	
	@ParameterizedTest
	@MethodSource("getFluxDeTripletsDEntieurs")
	public void testParamMethodSourceTriplets(int param1, int param2, int expected) {
		assertEquals(expected, op.addition(param1, param2));
	}
	
	private static Stream<Arguments> getFluxDeTripletsDEntieurs() {
		return Stream.of(Arguments.of(4, 5, 9), Arguments.of(9, -4, 5), Arguments.of(102, -203, -101));
	}
	
	
	
	@ParameterizedTest
	@MethodSource("getTableauDeTripletsDEntieurs")
	public void testParamMethodSourceTableau(int param1, int param2, int expected) {
		assertEquals(expected, op.addition(param1, param2));
	}
	
	private static List<Object[]> getTableauDeTripletsDEntieurs() {
		return Arrays.asList(new Object[][]{{4, 5, 9},{9, -4, 5},{103, -203, -100}});
	}
	
	
	@ParameterizedTest(name = "{index} - Test de l''addition :  {0} + {1} = {2}")
	@CsvSource(value =  {"4, 5, 9", "9, -4, 5", "102, -203, -101"})
	public void testParamLibelle(int param1, int param2, int expected) {
		assertEquals(expected, op.addition(param1, param2));
	}

	
	
}
