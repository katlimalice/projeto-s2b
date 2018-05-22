package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTasks;
import tasks.CadastroTasks.CadastroTask;

public class CadastroTestCases {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTasks(driver);
		
	}

	@Test
	public void testMain() throws Throwable {
		
		this.cadastro.preencherCadastro("nomeusuario", "teste@teste", "nome", "sobrenome", "@twitter", "minhasenha", "minhasenha");
		TimeUnit.SECONDS.sleep(5);
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
		
	}

}
