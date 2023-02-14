
  package utilities;

import cucumber.api.java.After;

public class Afterclass2 {
  
  @After public void Afteraction() {
	  Setupdriver.tearDown();
  
  }
  
  }
 