package starter.stepdefinition.Menu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.Menu.MenuPage;

public class SearchMenuSteps extends PageObject {

    @Steps
    MenuPage menuPage;

    @And("i input name menu")
    public void inputNameMenu(){
        menuPage.InputNameMenu("bihun");
    }

    @Then("menu i've been searched is displayed")
    public void menuDisplayed(){
        Assertions.assertTrue(menuPage.validateMenuDisplayed());
    }

    // deleted name menu
    @And("i input delated name menu")
    public void inputUnexistNameMenu(){
        menuPage.InputNameMenu("Tropical Mocktail");
    }
    @Then("menu is not displayed")
    public void menuNotDisplayed(){
        Assertions.assertTrue(menuPage.validateDeletedMenuNotDisplayed());
    }
}
