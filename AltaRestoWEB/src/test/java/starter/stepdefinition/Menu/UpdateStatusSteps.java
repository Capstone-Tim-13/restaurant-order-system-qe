package starter.stepdefinition.Menu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.Menu.MenuPage;

public class UpdateStatusSteps extends PageObject {

    @Steps
    MenuPage menuPage;

    @And("i click switch button")
    public void clickSwithButton(){
        menuPage.clickSwitchButton();
    }
    @Then("status successfully changed")
    public void statusSuccessfullyChanged(){
        menuPage.NotifyStatusChanged();
    }
}
