package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

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
		
		//Metodos del explorador 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Metodos de navegación
		
		//driver.navigate ().back();
		//Thread.sleep (2000);
		//driver.navigate ().forward();
		//Thread.sleep (2000);
		//driver.navigate ().refresh();
		
		//Verificar elementos en la pagina es decir que existan o se muestren
		
		boolean prodDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if (prodDisplayed) {
			System.out.println("El articulo esta desplegado ");
		}
		
		// Obtener texto o validar si un texto mostrado en el navegador es correcto
		
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean msjcorrect = prodName.contains("Sauce Labs Backpack");
		if (msjcorrect) {
			System.out.println("El nombre del articulo es correcto");
		}else {
			System.out.println("El nombre del articulo es INCORRECTO");
		}
		
		//Dropdowns
		
		Select drpProdCont = new Select (driver.findElement(By.className("product_sort_container")));
		drpProdCont.selectByVisibleText("Price (low to high)");
		Thread.sleep(2000);
		
		//cerrar ventanas
		//driver.close(); //cerrar la ventana actual que el webdriver haya abierto o este utilizando
		driver.quit(); //Cierra todas las ventanas que se esten utilizando por el webdriver
	
		

	}

}
