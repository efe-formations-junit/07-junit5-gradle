	
	
	package fr.formation.test.junit3;
	
	import junit.framework.TestCase;
	
	public class TestPlusieursMethodesOK extends TestCase {
		
		public void testExemple1()  {
			assertEquals(10, 4 + 6);
		}
		
		public void testExemple2()  {
			assertNotNull(new String ("Chaine"));
		}
	}
	
	
