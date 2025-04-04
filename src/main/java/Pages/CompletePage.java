package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
    private WebDriver driver;

    public CompletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "h2.complete-header")
    WebElement orderText;

    public String getOrderText(){
        return orderText.getText();
    }
}
