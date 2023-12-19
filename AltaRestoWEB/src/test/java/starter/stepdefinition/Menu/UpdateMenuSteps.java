package starter.stepdefinition.Menu;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.Menu.DetailMenuPage;
import starter.pages.Menu.MenuPage;

public class UpdateMenuSteps extends PageObject {

    @Steps
    MenuPage menuPage;

    @Steps
    DetailMenuPage detailMenuPage;

    @And("i click settings on the menu")
    public void clickSettingsMenu(){
        menuPage.clickSettingMenu();
    }
    @And("i click edit")
    public void clickEdit(){
        menuPage.clickEdit();
    }
    @And("i input new data")
    public void inputNewData(){
        detailMenuPage.InputDetailHarga("20000");
    }

    // update empty field
    @And("i input new data with empty field")
    public void inputNewDataEmptyField(){
        detailMenuPage.InputDeskripsiMenu(" ");
    }
}
