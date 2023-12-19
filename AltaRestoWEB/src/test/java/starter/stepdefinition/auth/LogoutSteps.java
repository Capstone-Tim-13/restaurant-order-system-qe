package starter.stepdefinition.auth;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;
import starter.pages.auth.LoginPage;

public class LogoutSteps extends PageObject {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    LoginPage loginPage;


    @When("i click logout button")
    public void ClickLogoutBtn(){
        dashboardPage.ClickLogoutBtn();
    }

    @Then("i directed to login page")
    public void DirectedToLoginPage(){
        Assertions.assertTrue(loginPage.validateOnTheLoginPage());
    }
}
