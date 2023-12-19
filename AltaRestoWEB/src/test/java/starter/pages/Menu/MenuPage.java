package starter.pages.Menu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {
    private By TambahkanMenu(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/button");
    }
    private By TambahkanMenuSatuan(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/button[1]");
    }
    private By MenuPageFeature(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/ul/li");
    }
    private By SettingMenu(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div[2]/img");
    }
    private By EditMenu(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div[2]/div/button[1]");
    }
    private By kategoriMenu(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/ul/li/a[2]");
    }
    private By MenuByCategory(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/img");
    }
    private By SwitchButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div[1]/div/label/div[1]");
    }
    private By notifyStatusChanged(){
        return By.xpath("/html/body/div/div[1]/div/div/div[2]");
    }

    public void ClickTambahkanMenu(){
        $(TambahkanMenu()).click();
    }
    public void ClickTambahkanMenuSatuan(){
        $(TambahkanMenuSatuan()).click();
    }
    public boolean ValidateOnTheMenuPage(){
        return $(MenuPageFeature()).isDisplayed();
    }
    public void clickSettingMenu(){
        $(SettingMenu()).click();
    }
    public void clickEdit(){
        $(EditMenu()).click();
    }

    public void clickCategory(){
        $(kategoriMenu()).click();
    }

    public boolean validationMenuByCategory(){
        return $(MenuByCategory()).isDisplayed();
    }

    public void clickSwitchButton(){
        $(SwitchButton()).click();
    }
    public void NotifyStatusChanged(){
        $(notifyStatusChanged()).isDisplayed();
    }
}
