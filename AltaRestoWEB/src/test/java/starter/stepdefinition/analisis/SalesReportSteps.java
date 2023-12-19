package starter.stepdefinition.analisis;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.Analisis.SalesReportPage;

public class SalesReportSteps extends PageObject {

    @Steps
    SalesReportPage salesReportPage;

    @And("i click period time dropdown")
    public void clickPeriodTimebtn(){
        salesReportPage.clickPeriodTime();
    }

    @And("i select period time")
    public void selectPeriodTime(){
        salesReportPage.selectPeriodTime();
    }

    @Then("sales report is changing by period time")
    public void salesReportIsChanged(){
        Assertions.assertTrue(salesReportPage.validateGrafikIsChanged());
    }
}
