package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a.shopping_cart_link")
    WebElement btnCart;


    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public void setAddToCart(String product){
        // Reemplazar espacios por guiones
        String productString = product.replace(" ", "-").toLowerCase();

        // Crear el xpath dinámicamente en tiempo de ejecución
        By productItem = By.xpath("//*[@id='add-to-cart-" + productString + "']");

        WebElement addToCart = driver.findElement(productItem);
        addToCart.click();
    }

    public void clickBtnCart(){
        btnCart.click();
    }



}
