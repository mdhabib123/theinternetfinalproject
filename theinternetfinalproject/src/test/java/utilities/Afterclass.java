
  package utilities;

import cucumber.api.java.After;

public class Afterclass {
  
  @After public void Afteraction() {
	  Setupdriver.tearDown();
  
  }
  
  }
 