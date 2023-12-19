package starter.pages.Analisis;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SalesReportPage extends PageObject {
    private By periodTimeBtn(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/button");
    }
    private By PeriodTime(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]");
    }
    private By GrafikSalesReport(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[3]/div[2]/span");
    }
    public void clickPeriodTime(){
        $(periodTimeBtn()).click();
    }
    public void selectPeriodTime(){
        $(PeriodTime()).click();
    }
    public boolean validateGrafikIsChanged(){
        waitForCondition().until(
                webDriver -> webDriver.findElement(GrafikSalesReport()).isDisplayed()
        );
        return $(GrafikSalesReport()).isDisplayed();
    }

}
