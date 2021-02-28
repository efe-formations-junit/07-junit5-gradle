	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages("fr.formation.test") 
	@IncludeTags({"Toujours", "IntegrationTest"})
	public class SuiteTest6 {
		// Classes de test du package
		// définis par l'un des deux tags
	}

	
	