package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTask;

public class CadastroTestCase {
	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.muambator.com.br/perfil/registre-se/");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
		
	}

	@Test
	public void testMain(){
		
		this.cadastro.preencherCadastro("katlim1", "katlimalice@gmail.com", "Katlim", "Martin", "katlim17", "ab123456", "ab123456");
		this.cadastro.criarConta();
	}
	
	@After
	public void tearDown() throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		this.driver.quit();
		
	}

}
