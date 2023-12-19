package starter.stepdefinition.order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.DashboardPage;
import starter.pages.order.OrderPage;

public class UpdateOrderStatusSteps extends PageObject {

    @Steps
    OrderPage orderPage;
    @Steps
    DashboardPage dashboardPage;

    @And("i click order page")
    public void clickOrderPage(){
        dashboardPage.clickOrderPage();
    }
    @And("i click status order")
    public void clickStatusOrder(){
        orderPage.clickStatusOrder();
    }
    @Then("i change status order")
    public void changeStatusOrder(){
        orderPage.selectStatusOrder();
    }
}
