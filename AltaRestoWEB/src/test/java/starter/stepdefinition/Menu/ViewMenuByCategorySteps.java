package starter.stepdefinition.Menu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Menu.MenuPage;

public class ViewMenuByCategorySteps {

    @Steps
    MenuPage menuPage;

    @And("i click category")
    public void clickCategory(){
        menuPage.clickCategory();
    }
    @Then("menu by category is displayed")
    public void menuByCategoryDisplayed(){
        Assertions.assertTrue(menuPage.validationMenuByCategory());
    }
}
