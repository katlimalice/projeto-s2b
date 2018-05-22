package tasks;

import org.openqa.selenium.WebDriver;

import appobject.LoginAppObject;

public class LoginTask {
	private LoginAppObject loginAppObject;

	public LoginTask(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);
	}

	public void preencherLogin(String usuario, String senha) {
		this.loginAppObject.getLoginTextField().sendKeys("usuario");
		this.loginAppObject.getSenhaTextField().sendKeys("senha");
	}

	public void entrar() {
		this.loginAppObject.getEntrarButton().click();
	}

}
