package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {

	private WebDriver driver;

	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNomeUsuarioTextField() {
		return this.driver.findElement(By.id("id_username"));

	}

	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("id_email"));

	}

	public WebElement getNomeTextField() {
		return this.driver.findElement(By.id("id_first_name"));

	}

	public WebElement getSobrenomeTextField() {
		return this.driver.findElement(By.id("id_last_name"));

	}

	public WebElement getTwitterTextField() {
		return this.driver.findElement(By.id("id_twitter"));

	}

	public WebElement getNotificarTwitterCheckBox() {
		return this.driver.findElement(By.id("id_notificar_twitter"));
	}

	public WebElement getSenhaTextField() {
			return this.driver.findElement(By.id("id_senha"));

	}
	
	public WebElement getCofirmeSenhaTextField() {
		return this.driver.findElement(By.id("id_confirmacao_senha"));

	}

	public WebElement getCriarContaButton() {
		return this.driver.findElement(By.cssSelector("#wrapper > div > div > form > div.form-group.right2center > button"));
	}
	
	}


