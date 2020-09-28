package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PhonesPage {
	
	WebDriver driver;
	
	public PhonesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		@FindBy(css ="img[class='ui-search-result-image__element']")
	})
	List<WebElement> selectPhone; 

	public List<WebElement> selectPhone() {
		return selectPhone;

	}
}
