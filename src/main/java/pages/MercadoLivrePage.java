package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MercadoLivrePage {

	WebDriver driver2;
	
	public MercadoLivrePage(WebDriver driver2) {
		this.driver2 = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//a[text()='Celulares e Smartphones']")
	WebElement clickCategorie;
	
	@FindBys({
		@FindBy(xpath="//*[@class='nav-categs-departments']//a")
	})
	List<WebElement> chooseCategorie;
	
	public WebElement clickCategorie() {
		return clickCategorie;
	}
	
	public List<WebElement> chooseCategorie(){
		return chooseCategorie;
	}
	
	
	
	
	
}
