
package fr.formation.test.assertion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.formation.test.Personne;

public class Operation10assertAllTest {

//	@Test
	public void testAll1() {

		Personne p = new Personne("Legrand", "Julie", 35);

		Assertions.assertAll("Champs mal remplis", () -> assertEquals(p.getNom(), "Legrand", "Nom non conforme"),
				() -> assertEquals(p.getPrenom(), "Julie", "Prénom non conforme"),
				() -> assertTrue(p.getAge() == 35, "Age non conforme"));
	}

	@Test
	public void testAll2() {

		Personne p = new Personne("Lepetit", "Anne", 51);

		Assertions.assertAll("Champs mal remplis", () -> assertEquals(p.getNom(), "Legrand", "Nom non conforme"),
				() -> assertEquals(p.getPrenom(), "Julie", "Prénom non conforme"),
				() -> assertTrue(p.getAge() == 35, "Age non conforme"));
	}

}
