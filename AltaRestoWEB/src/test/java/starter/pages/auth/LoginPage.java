package starter.pages.auth;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By LoginTitle(){
        return By.xpath("/html/body/div/div[2]/div/div/form/div[1]/input");
    }
    private By EmailField(){
        return By.name("email");
    }
    private By PasswordField(){
        return By.xpath("/html/body/div/div[2]/div/div/form/div[2]/input");
    }
    private By RememberMebtn(){
        return By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div/label/div[1]");
    }
    private By LoginButton(){
        return By.xpath("/html/body/div/div[2]/div/div/form/button");
    }
    private By failedLoginMessage(){
        return By.xpath("/html/body/div/div[1]/div/div/div[2]");
    }
    private By WarningMessage(){
        return By.xpath("/html/body/div/div[2]/div/div/p/span[1]");
    }
    @Step
    public boolean validateOnTheLoginPage(){
        return $(LoginTitle()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(PasswordField()).type(password);
    }
    @Step
    public void ClickRememberMe(){
        $(RememberMebtn()).click();
    }
    @Step
    public void ClickLoginButton(){
        $(LoginButton()).click();
    }
    @Step
    public boolean ValidateEqualWarningMessage(String message){
        return $(WarningMessage()).getText().equalsIgnoreCase(message);
    }
    @Step
    public boolean ValidateWarningMessageIsDisplayed(){
       return $(WarningMessage()).isDisplayed();
    }
    @Step
    public boolean ValidateErrorMessageIsDisplayed(){
        return $(failedLoginMessage()).isDisplayed();
    }

    @Step
    public boolean ValidateEqualErrorMessage(String message){
        return $(failedLoginMessage()).getText().equalsIgnoreCase(message);
    }
}
