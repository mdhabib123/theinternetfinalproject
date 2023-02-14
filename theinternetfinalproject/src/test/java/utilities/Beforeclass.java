package utilities;

import cucumber.api.java.Before;

public class Beforeclass {
	
	
	@Before
		public static void setUp() {
			System.out.println("Chrome driver initialized.");
			Setupdriver.setup();
			
	}
}


