package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    private By AltaLogo(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/a/img");
    }

    private By LogoutBtn(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/a/p");
    }
    private By MenuPage(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a[4]/p");
    }
    private By FeatureMenuPage(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/ul/li/a[1]");
    }
    private By OrderPage(){
        return By.xpath("//*[@id=\"navlink-3\"]");
    }
    private By analisisPage(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a[2]");
    }
    private By ReviewRatingPage(){
        return By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a[5]");
    }
    private By periodTime(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[1]/div[2]");
    }
    private By selectMonth(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[4]/td[2]/button");
    }
    private By salesStaticGrafik(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/canvas");
    }
    public boolean validateOnTheDashboardPage(){
        return $(AltaLogo()).isDisplayed();
    }
    public void ClickLogoutBtn(){
        $(LogoutBtn()).click();
    }
    public void ClickMenuPage(){
        $(MenuPage()).click();
    }
    public void clickOrderPage(){
        $(OrderPage()).click();
    }
    public void clickAnalisisPage(){
        $(analisisPage()).click();
    }
    public void ClickReviewRatingPage(){
        $(ReviewRatingPage()).click();
    }
    public void clickPeriodTime(){
        $(periodTime()).click();
    }
    public void clickselectedMonth(){
        $(selectMonth()).click();
    }
    public boolean validateGrafikSalesStaticChanged(){
        return $(salesStaticGrafik()).isDisplayed();
    }
}
