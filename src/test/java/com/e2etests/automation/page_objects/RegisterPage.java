package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	
	private ConfigFileReader configFileReader;
	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'REGISTER')]")
	public static WebElement btnRegister;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),' Note: Your user name is Ahmed.')]")
	public static WebElement registerMessage;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnEnvoyer;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Method */
	
	public void goToUrl() {
		Setup.getdriver().get(configFileReader.getProperties("home.url"));	
	}
	public void clickOnBtnRegister() {
		btnRegister.click();
	}
	public void fillfirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void filllastName(String lastname) {
		lastName.sendKeys(lastname);
}
	public void fillphone(String number) {
		phone.sendKeys(number);
}
	public void fillemail(String Email) {
		email.sendKeys(Email);
}
	public void filladdress1(String Adress1) {
		address1.sendKeys(Adress1);
}
	public void fillcity(String City) {
		city.sendKeys(City);
}
	public void fillstate(String State) {
		state.sendKeys(State);
	}
	public void fillpostalCode(String codepostal) {
		postalCode.sendKeys(codepostal);
	}
	
	public void selectCountry(String Country ) {
		Select dropdownlist = new Select(country);
		dropdownlist.selectByVisibleText(Country);
	}
	public void fillusername(String username) {
		userName.sendKeys(username);
	}
	public void fillpassword(String Password) {
		password.sendKeys(Password);
	}
	public void fillconfirmpassword(String Password) {
		confirmPassword.sendKeys(Password);
	}
	
	public void clickOnBtnSubmit() {
		btnEnvoyer.click();
	}

}
