package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.ActitimeLoginPage;

public class ActitimeStepDef {
	
	
	ActitimeLoginPage acti = new ActitimeLoginPage();
	
	@Given("User should be able to open actiTIME web")
	public void user_should_be_able_to_open_acti_time_web() {
		
	}
	@When("User enter username")
	public void user_enter_username() {
		acti.enterUserName("admin");
	}
	@And("User enter password")
	public void user_enter_password() {
	    acti.enterPassword("manager");
	}
	@Then("User click on Login button")
	public void User_click_on_Login_button() {
	    acti.clickonLogin();
	}
}