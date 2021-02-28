	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
	import org.junit.runner.RunWith;
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages("fr.formation.test") 
	@ExcludePackages({"fr.formation.test.hypothese", "fr.formation.test.assertion"}) 
	public class SuiteTest4 {
		// Classes de test du package
		// fr.formation.test
		// et ses éventuels sous-packages
		// sauf fr.formation.test.hypothese
		// et fr.formation.test.assertion
	}

	
	