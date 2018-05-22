package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LoginTask;

public class LoginTestCase {

	private WebDriver driver;
	private LoginTask login;

	@Before
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.muambator.com.br/login/");
		this.driver.manage().window().maximize();
		this.login = new LoginTask(driver);

	}

	@Test
	public void testMain() throws Throwable {

		this.login.preencherLogin("usuario", "senha");

		TimeUnit.SECONDS.sleep(5);
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}
}
