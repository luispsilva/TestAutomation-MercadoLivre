package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MercadoLivrePage;
import pages.PhonesPage;

public class ChoosePhone {

	WebDriver driver;

	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\luisp\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.mercadolivre.com.br/");
	}

	@Test
	public void GetFirstPhone() throws InterruptedException {

		MercadoLivrePage categorie = new MercadoLivrePage(driver);

		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector(".nav-menu-categories-link"));
		a.moveToElement(move).build().perform();

		for (int i = 0; i <= 1; i++) {
			categorie.chooseCategorie().get(i).sendKeys(Keys.DOWN);
		}
		categorie.clickCategorie().click();

		PhonesPage phone = new PhonesPage(driver);
		phone.selectPhone().get(0).click();
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
}
