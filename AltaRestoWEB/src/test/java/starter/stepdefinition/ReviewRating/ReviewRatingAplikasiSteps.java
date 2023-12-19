package starter.stepdefinition.ReviewRating;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.ReviewRating.ReviewRatingAplikasi;

public class ReviewRatingAplikasiSteps extends PageObject {
    @Steps
    ReviewRatingAplikasi reviewRatingAplikasi;

    @Then("review and rating from aplikasi customer is displayed")
    public void reviewratingAplikasiCustomerDisplayed(){
        Assertions.assertTrue(reviewRatingAplikasi.validateReviewCustomerAplikasi());
    }
}
