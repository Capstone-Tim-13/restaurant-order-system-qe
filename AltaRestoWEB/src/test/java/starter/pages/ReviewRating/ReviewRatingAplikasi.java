package starter.pages.ReviewRating;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReviewRatingAplikasi extends PageObject {
    private By customerAplikasi(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/p[1]");
    }
    public boolean validateReviewCustomerAplikasi(){
        return $(customerAplikasi()).isDisplayed();
    }
}
