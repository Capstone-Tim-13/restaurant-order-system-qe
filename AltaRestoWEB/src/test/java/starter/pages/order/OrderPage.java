package starter.pages.order;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By statusOrder(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/td[9]/div/div/div");
    }
    private By changeStatusOrder(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/td[9]/div/div/div/div/input");
    }
    private By searchBar(){
        return By.id("search");
    }
    private By IDorder(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]");
    }
    private By allorder(){
        return By.xpath("//*[@id=\"pesananmap-masuk\"]/td[2]");
    }
    public void clickStatusOrder(){
        $(statusOrder()).click();
    }
    public void selectStatusOrder(){
        $(changeStatusOrder()).click();
    }
    public void inputId(String id){
        $(searchBar()).type(id);
    }
    public boolean validateIdOrderIsDisplayed(){
        return $(IDorder()).isDisplayed();
    }
    public boolean validateAllOrderIsDisplayed(){
        return $(allorder()).isDisplayed();
    }
}
