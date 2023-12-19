package starter.pages.Analisis;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AnalisisPage extends PageObject {

    private By clickCategory(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/button");
    }

    private By selectCategory(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2] ");
    }

    private By menufavorite(){
        return By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/img");
    }

    public void ClickCategoryButton(){
        $(clickCategory()).click();
    }

    public void selectTheCategory(){
        $(selectCategory()).click();
    }
    public boolean validateFavoriteMenuByCategoryIsDisplayed(){
        return $(menufavorite()).isDisplayed();
    }
}
