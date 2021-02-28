package fr.formation.test.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class TagTest {

	@Test
	@Tag("IntegrationTest")
	public void testEnvoiFormulaire() {
	}
	 
	@Test
	@Tag("UnitTest")
	@Tag("Toujours")
	public void testCreationObjet() {
	}
	 
	@Test
	@Tag("Toujours")
	public void testFactory() {
	}

	 
	@Test
	@Tag("Jamais")
	public void testQuiSertARien() {
	}

}

