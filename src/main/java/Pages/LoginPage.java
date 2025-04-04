package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    @FindBy(xpath = "//h3[text()='Epic sadface: Username and password do not match any user in this service']")
    WebElement credentialIncorrectText;
    public void navigateToUrl(){
        driver.get("https://www.saucedemo.com/");
    }

    public void setUsernameField(String user){
        usernameField.sendKeys(user);
    }

    public  void  setPasswordField(String pass){
        passwordField.sendKeys(pass);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getErrorText(){
        return credentialIncorrectText.getText();
    }
}
