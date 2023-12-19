package starter.stepdefinition.order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.order.OrderPage;

public class GetOrderByIdSteps extends PageObject {

    @Steps
    OrderPage orderPage;

    @And("i input order id")
    public void inputOrderId(){
        orderPage.inputId("00AA002 ");
    }
    @Then("the order by id is displayed")
    public void orderByIdDisplayed(){
        Assertions.assertTrue(orderPage.validateIdOrderIsDisplayed());
    }

    //UNEXIST ID
    @And("i input unexist order id")
    public void inputUnexistOrderId(){
        orderPage.inputId("09991 ");
    }
    @Then("order is not displayed")
    public void orderNotDisplayed(){
    }
}
