package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	
	private WebDriver driver;

	public LoginAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginTextField() {
		return this.driver.findElement(By.id("id_username"));

	}

	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("id_email"));
	}
	
}

