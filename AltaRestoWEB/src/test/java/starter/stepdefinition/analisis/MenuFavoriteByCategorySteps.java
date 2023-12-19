package starter.stepdefinition.analisis;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.Analisis.AnalisisPage;
import starter.pages.DashboardPage;

public class MenuFavoriteByCategorySteps extends PageObject {

    @Steps
    AnalisisPage analisisPage;
    @Steps
    DashboardPage dashboardPage;

    @And("i click analisis page")
    public void clickAnalisisPage(){
        dashboardPage.clickAnalisisPage();
    }

    @And("i click the category")
    public void clickTheCategory(){
        analisisPage.ClickCategoryButton();
    }
    @And("i select the category")
    public void selectTheCategory(){
        analisisPage.selectTheCategory();
    }
    @Then("menu favorite from the selected category is displayed")
    public void menuFavoriteisDisplayed(){
        Assertions.assertTrue(analisisPage.validateFavoriteMenuByCategoryIsDisplayed());
    }
}
