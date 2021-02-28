	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages("fr.formation.test") 
	@IncludeClassNamePatterns({"^.*Operation.*$" })
	public class SuiteTest5 {
		// Classes de test du package
		// matchant avec *Operation*
	}

	
	