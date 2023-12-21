package starter.pages.Menu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DetailMenuPage extends PageObject {

    private By DetailMenuHeader(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/h1");
    }
    private By InputNamaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/input");
    }
    private By DeskripsiMenuField(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/textarea");
    }
    private By DetailHargaField(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[3]/input");
    }
    private By Kategori(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/button");
    }

    private By valueCategory(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]");
    }
    private By uploadImage(){
        return By.id("file-input");
    }
    private By simpanButton(){
        return By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[3]/div[2]/button");
    }
    private By errorMessage(){
        return By.xpath("/html/body/div/div[1]/div");
    }
    public boolean validateOnTheDetailMenuPage(){
        return $(DetailMenuHeader()).isDisplayed();
    }
    public void InputNamaMenu(String nama){
        $(InputNamaField()).type(nama);
    }
    public void InputDeskripsiMenu(String deskripsi){
        $(DeskripsiMenuField()).type(deskripsi);
    }
    public void InputDetailHarga(String harga){
        $(DetailHargaField()).type(harga);
    }
    public void ClickKategori(){
        $(Kategori()).click();
    }
    public void selectCategory(){
        $(valueCategory()).click();
    }

    public void UploadImage(){
        WebElement uploadElement = $(uploadImage());
        uploadElement.sendKeys("C:/Users/yudika/nasi bakar.JPEG");
        $(simpanButton()).click();
    }
    public boolean validateErrorMessage(){
        return $(errorMessage()).isDisplayed();
    }
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
}
