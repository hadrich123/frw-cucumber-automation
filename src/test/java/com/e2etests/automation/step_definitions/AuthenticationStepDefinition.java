package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToUrl();
	}

	@When("Je saisie le User Name {string}")
	public void jeSaisieLeUserName(String name) {
		authenticationPage.fillUsername(name);
	}

	@When("Je saisie le password  {string}")
	public void jeSaisieLePassword(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.clickOnBtnSubmit();
		;
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);
	}
}
