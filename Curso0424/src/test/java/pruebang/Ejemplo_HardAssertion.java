package pruebang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Ejemplo_HardAssertion {
	@Test
	
	
	public void f () {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle ();
		Assert.assertEquals (expectedTitle,actualTitle, "El titulo no coincide");
		
	}

}
