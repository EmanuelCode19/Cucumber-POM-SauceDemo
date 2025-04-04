package steps;

import Pages.CartPage;
import hooks.Hook;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartStep {

    private CartPage cartpage;

    public CartStep(){
        this.cartpage = new CartPage(Hook.driver);
    }

    @When("verifico que el producto sea {string} y su precio {string}")
    public void verifico_el_producto_y_precio(String product, String price){
        Assert.assertEquals(product,cartpage.getNameProduct());
        Assert.assertEquals(price,cartpage.getPriceProduct());


    }

    @When("procede al checkout")
    public void procede_al_Checkout() throws InterruptedException {
        Thread.sleep(2000);
        cartpage.clickBtnCheckout();
    }
}
