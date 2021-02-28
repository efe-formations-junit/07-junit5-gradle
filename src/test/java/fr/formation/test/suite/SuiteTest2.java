	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
	import org.junit.platform.suite.api.SelectPackages;
	import org.junit.runner.RunWith;
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages("fr.formation.test.tag") 
	public class SuiteTest2 {
		// Classes de test du package
		// fr.formation.test.tag
		// et ses éventuels sous-packages
	}

	
	