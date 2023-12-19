package starter.pages.ReviewRating;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReviewRatingWebsite extends PageObject {

    private By ReviewWebsiteBtn(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/button[2]/span");
    }
    private By ReviewWebsiteCustomer(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/div[1]/div[2]/h2");
    }
    public void clickReviewWebsiteBtn(){
        $(ReviewWebsiteBtn()).click();
    }
    public boolean ValidateReviewCustomerWebsite(){
        return $(ReviewWebsiteCustomer()).isDisplayed();
    }
}
