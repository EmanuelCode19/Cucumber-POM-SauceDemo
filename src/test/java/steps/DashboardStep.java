package steps;

import Pages.DashboardPage;
import hooks.Hook;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStep{


    public DashboardPage dashboardpage;
    public DashboardStep() {
        this.dashboardpage = new DashboardPage(Hook.driver);
    }

    @When("agrega al carrito el producto {string}")
    public void agrega_al_carrito_el_producto(String product) throws InterruptedException {
        String urlExpected = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(urlExpected,dashboardpage.getCurrentUrl());
        dashboardpage.setAddToCart(product);
        Thread.sleep(2000);
    }


    @When("navega al carrito de compras")
    public void navega_al_carrito_de_compras(){
        dashboardpage.clickBtnCart();
    }


}
