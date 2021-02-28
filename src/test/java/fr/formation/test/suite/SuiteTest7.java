	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages("fr.formation.test.tag") 
	@ExcludeTags({"Toujours", "Jamais"})

	public class SuiteTest7 {
		// Classes de test du package
		// exceptées les methodes annotées
		// par l'un des deux tags
	}

	
	