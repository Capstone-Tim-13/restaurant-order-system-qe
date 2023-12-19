package starter.stepdefinition.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;
import starter.pages.auth.LoginPage;

public class LoginSteps extends PageObject {

    @Steps
    LoginPage loginPage;
    @Steps
    DashboardPage dashboardPage;

    @Given("admin on the login page")
    public void AdminOnTheLoginPage(){
        loginPage.openUrl("https://altaresto.netlify.app/login");
        Assertions.assertTrue(loginPage.validateOnTheLoginPage());
    }
    @When("i input email with valid credentials")
    public void inputValidEmailCred(){
        loginPage.inputEmail("admin123@gmail.com");
    }
    @And("i input correct password")
    public void inputCorrectPassword(){
        loginPage.inputPassword("admin321");
    }
    @And("i click remember me button switch")
    public void ClickRememberMe(){
        loginPage.ClickRememberMe();
    }
    @And("i click login button")
    public void ClickLoginButton(){
        loginPage.ClickLoginButton();
    }
    @Then("i directed to dashboard page")
    public void DirectedToDashboardPage(){
        dashboardPage.validateOnTheDashboardPage();
    }

    //Invalid Email Cred
    @When("i input email with invalid email credentials")
    public void InputInvalidEmailCred(){
        loginPage.inputEmail("admin3");
    }
    @Then("warning message {string} is shown")
    public void WarningMessageisShown(String message){
        loginPage.ValidateWarningMessageIsDisplayed();
        loginPage.ValidateEqualWarningMessage(message);
    }

    //Invalid password
    @And("i input invalid password")
    public void InputInvalidPasword(){
        loginPage.inputPassword("salah123");
    }
    @Then("error message {string} is shown")
    public void ErrorMessageIsShown(String message){
        loginPage.ValidateErrorMessageIsDisplayed();
        loginPage.ValidateEqualErrorMessage(message);
    }
}
