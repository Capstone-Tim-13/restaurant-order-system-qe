package starter.stepdefinition.ReviewRating;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;
import starter.pages.ReviewRating.ReviewRatingWebsite;

public class ReviewRatingWebsiteSteps extends PageObject {

    @Steps
    ReviewRatingWebsite reviewRatingWebsite;
    @Steps
    DashboardPage dashboardPage;

    @And("i click review rating page")
    public void clickReviewRatingPage(){
        dashboardPage.ClickReviewRatingPage();
    }
    @And("i click website version")
    public void clickWebsiteVersion(){
        reviewRatingWebsite.clickReviewWebsiteBtn();
    }
    @Then("review and rating from website customer is displayed")
    public void ReviewRatingWebsiteCustomerIsDisplayed(){
        Assertions.assertTrue(reviewRatingWebsite.ValidateReviewCustomerWebsite());
    }

}
