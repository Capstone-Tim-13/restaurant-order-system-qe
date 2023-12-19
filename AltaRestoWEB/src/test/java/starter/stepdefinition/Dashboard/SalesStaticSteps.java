package starter.stepdefinition.Dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;

public class SalesStaticSteps extends PageObject {

    @Steps
    DashboardPage dashboardPage;

    @And("i click period time")
    public void clickPeriodTime(){
        dashboardPage.clickPeriodTime();
    }
    @And("i choose the month")
    public void chooseTheMonth(){
        dashboardPage.clickselectedMonth();
    }
    @Then("sales static from that month is displayed")
    public void salesStaticFromThatMonthIsDisplayed(){
        Assertions.assertTrue(dashboardPage.validateGrafikSalesStaticChanged());
    }
}
