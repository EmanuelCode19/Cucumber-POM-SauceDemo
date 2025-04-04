package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
    private WebDriver driver;

    public InformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "first-name")
    WebElement nameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "continue")
    WebElement btnContinue;

    public void setNameInput(String name){
        nameInput.sendKeys(name);
    }

    public void  setLastNameInput(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public void setPostalCodeInput(String postalCode){
        postalCodeInput.sendKeys(postalCode);
    }

    public void clickBtnContinue(){
        btnContinue.click();
    }

}
