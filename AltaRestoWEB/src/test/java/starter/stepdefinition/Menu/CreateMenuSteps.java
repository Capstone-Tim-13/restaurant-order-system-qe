package starter.stepdefinition.Menu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Menu.DetailMenuPage;
import starter.pages.Menu.MenuPage;
import starter.pages.DashboardPage;


public class CreateMenuSteps {

    @Steps
    DetailMenuPage detailMenuPage;
    @Steps
    DashboardPage dashboardPage;
    @Steps
    MenuPage menuPage;

    @And("i click menu page")
    public void ClickMenuPage(){
        dashboardPage.ClickMenuPage();
    }

    @And("i click tambahkan menu")
    public void ClickTambahkanMenu(){
        menuPage.ClickTambahkanMenu();
    }

    @And("i click tambahkan menu satuan")
    public void ClickTambahkanMenuSatuan(){
        menuPage.ClickTambahkanMenuSatuan();
    }

    @And("i directed to detail menu")
    public void directedToDetailMenu(){
        detailMenuPage.validateOnTheDetailMenuPage();
    }

    @And("i click upload foto menu")
    public void uploadFotoMenu(){
        detailMenuPage.UploadImage();
    }
    @And("i input nama menu")
    public void InputNamaMenu(){
        detailMenuPage.InputNamaMenu("nasi bakar pedass");
    }

    @And("i input deskripsi menu")
    public void InputDeskripsiMenu(){
        detailMenuPage.InputDeskripsiMenu("nasi di bakar");
    }

    @And("i click kategori")
    public void ClickKategori(){
        detailMenuPage.ClickKategori();
    }
    @And("i select kategori")
    public void clickSelectCategory(){
        detailMenuPage.selectCategory();
    }
    @And("i input detail harga")
    public void InputDetailHarga(){
        detailMenuPage.InputDetailHarga("30000");
    }
    @Then("i click simpan button")
    public void ClickSimpanButton(){
        detailMenuPage.UploadImage();
    }

    @And("i directed to menu page")
    public void directedToMenuPage(){
        Assertions.assertTrue(menuPage.ValidateOnTheMenuPage());
    }

    //create menu empty field
    @And("i didnt input description")
    public void desrcriptionEmpty(){
        detailMenuPage.InputDeskripsiMenu(" ");
    }
    @And("i receive error message {string}")
    public void receiveErrorMessage(String message){
        detailMenuPage.validateErrorMessage();
        detailMenuPage.validateEqualErrorMessage(message);
    }
}
