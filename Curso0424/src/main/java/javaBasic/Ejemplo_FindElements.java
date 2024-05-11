package javaBasic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener o identificar los objetos  GUI/WebElements de la pagina
		
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Se realiza el login automatico
		
		userNameTxt.sendKeys ("standard_user");
		Thread.sleep (2000);
		pwdTxt.sendKeys("secret_sauce");
		Thread.sleep (2000);
		loginBtn.click();

		List <WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Numero de elementos en la lista de productos: " + prodList.size());
		
		String primerProd = prodList.get(0).getText();
		String segundoProd = prodList.get(1).getText();
		System.out.println(primerProd);
		System.out.println(segundoProd);
		
		for (int i = 0; i < prodList.size (); i++) {
			System.out.println("Los productos son: " + prodList.get (i) .getText ());
		}
				
		
	}

}
