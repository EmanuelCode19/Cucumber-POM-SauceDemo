package steps;

import Pages.CompletePage;
import hooks.Hook;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompleteStep {

    public CompletePage completepage;
    public CompleteStep(){
        this.completepage = new CompletePage(Hook.driver);
    }

    @When("se muestra el mensaje {string}")
    public void se_muestra_el_mensaje(String orderConfirmation){
        Assert.assertEquals(completepage.getOrderText(),orderConfirmation);
    }
}
