package tasks;

import org.openqa.selenium.WebDriver;

import appobject.CadastroAppObject;

public class CadastroTask {

		private CadastroAppObject cadastroAppObject;

		public CadastroTask(WebDriver driver) {
			this.cadastroAppObject = new CadastroAppObject(driver);
		}

		public void preencherCadastro(String nomeUsuario, String email, String nome, String sobrenome, String twitter,
				String senha, String confirmaSenha) {
			this.cadastroAppObject.getNomeUsuarioTextField().sendKeys("nomeUsuario");
			this.cadastroAppObject.getEmailTextField().sendKeys("email");
			this.cadastroAppObject.getNomeTextField().sendKeys("nome");
			this.cadastroAppObject.getSobrenomeTextField().sendKeys("sobrenome");
			this.cadastroAppObject.getTwitterTextField().sendKeys("twitter");
			this.cadastroAppObject.getNotificarTwitterCheckBox().click();
			this.cadastroAppObject.getSenhaTextField().sendKeys("senha");
			this.cadastroAppObject.getCofirmeSenhaTextField().sendKeys("confirmaSenha");
		}
		
		public void criarConta() {
			this.cadastroAppObject.getCriarContaButton().click();
		}
		
	}

	


