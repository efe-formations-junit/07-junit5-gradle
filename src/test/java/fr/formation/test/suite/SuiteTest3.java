
	package fr.formation.test.suite;
	
	import org.junit.platform.runner.JUnitPlatform;
	import org.junit.platform.suite.api.SelectClasses;
	import org.junit.runner.RunWith;

	import fr.formation.test.assertion.Operation04SameTest;
	import fr.formation.test.displayname.DisplayNameTest;
	import fr.formation.test.tag.TagTest;
	
	@RunWith(JUnitPlatform.class)
	@SelectClasses({ TagTest.class, Operation04SameTest.class, DisplayNameTest.class }) 
	public class SuiteTest3 {
		// Test de ces trois classes uniquement
	}

	
	