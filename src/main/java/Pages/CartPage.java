package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//    locators
    @FindBy(className = "inventory_item_name")
    WebElement productName;

    @FindBy(className = "inventory_item_price")
    WebElement productPrice;

    @FindBy(id = "checkout")
    WebElement btnCheckout;

//    actions

    public String getNameProduct(){
        return productName.getText();
    }

    public String getPriceProduct(){
        return productPrice.getText();
    }

    public void clickBtnCheckout(){

        btnCheckout.click();
    }

}
