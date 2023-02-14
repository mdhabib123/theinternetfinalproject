package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Challengingdomm {
	//WebDriver driver;
	
	//driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[5]/a")).click();
	
	@FindBy (linkText="Challenging DOM")	
	//@FindBy(xpath="//*[@id=\\\"content\\\"]/ul/li[5]/a")
	public WebElement ChallengingDOM;
	

  // @FindBy (xpath= "//*[@class='button success']")
  // public WebElement baz;
}



