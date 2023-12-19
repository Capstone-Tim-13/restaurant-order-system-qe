package starter.stepdefinition.order;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.order.OrderPage;

public class GetAllOrderSteps extends PageObject {

    @Steps
    OrderPage orderPage;

    @Then("i can see all order")
    public void seeAllOrder(){
        Assertions.assertTrue(orderPage.validateAllOrderIsDisplayed());
    }
}
