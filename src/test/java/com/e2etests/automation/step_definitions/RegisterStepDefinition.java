package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}
	
	@Given("Je me connecte sur l application Mercuryy")
	public void jeMeConnecteSurLApplicationMercury() {
		registerPage.goToUrl();
	}
	@When("Je clique sur le bouton register")
	public void jeCliqueSurLeBoutonRegister() {
		registerPage.clickOnBtnRegister();
	}
	@When("Je saisie First Name {string}")
	public void jeSaisieFirstName(String firstName) {
		registerPage.fillfirstName(firstName);
	}
	@When("Je saisie Last Name {string}")
	public void jeSaisieLastName(String lastName) {
		registerPage.filllastName(lastName);
	}
	@When("Je saisie Phone {string}")
	public void jeSaisiePhone(String Phone) {
		registerPage.fillphone(Phone);
	}
	@When("Je saisie Email {string}")
	public void jeSaisieEmail(String Email) {
		registerPage.fillemail(Email);
	    
	}
	@When("Je saisie Adresse {string}")
	public void jeSaisieAdresse(String adresse) {
		registerPage.filladdress1(adresse);
	}
	@When("Je saisie City {string}")
	public void jeSaisieCity(String City) {
		registerPage.fillcity(City);
	}
	@When("Je saisie State {string}")
	public void jeSaisieState(String State) {
		registerPage.fillstate(State);
	}
	@When("Je saisie Postal Code {string}")
	public void jeSaisiePostalCode(String PostalCode) {
		registerPage.fillpostalCode(PostalCode);
	}
	@When("Je selectionne Country {string}")
	public void jeSelectionneCountry(String Country) {
	    registerPage.selectCountry(Country);
	}
	@When("Je saisie User Name {string}")
	public void jeSaisieUserName(String userName) {
	   registerPage.fillusername(userName);
	}
	@When("Je saisie Password {string}")
	public void jeSaisiePassword(String Password) {
	   registerPage.fillpassword(Password);
	}
	@When("Je saisie Confirm Password {string}")
	public void jeSaisieConfirmPassword(String ConfirmPassword) {
		registerPage.fillconfirmpassword(ConfirmPassword);
	}
	@When("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.clickOnBtnSubmit();
	}
	@Then("Je me redirige vers la page  {string}")
	public void jeMeRedirigeVersLaPage(String text) {
		String message = RegisterPage.registerMessage.getText();
		Assert.assertEquals(message, text);
	}



}
