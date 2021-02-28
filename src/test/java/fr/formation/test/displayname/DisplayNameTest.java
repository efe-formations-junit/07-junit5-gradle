
	package fr.formation.test.displayname;
	
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;
	
	@DisplayName("Classe métier à tester")
	public class DisplayNameTest {
	
		@Test
		@DisplayName("Test particulier sur les objets Personne")
		public void changementNomTest1() {
		}
	
		@DisplayName("╯°□°）╯")
		@Test
		public void changementNomTest2() {
		}
	
		@Test
		@DisplayName("😱")
		public void changementNomTest3() {
		}
	}

	
	