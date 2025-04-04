package steps;

import Pages.InformationPage;
import hooks.Hook;
import io.cucumber.java.en.When;

public class InformationStep {
    public InformationPage informationpage;

    public InformationStep(){
        this.informationpage = new InformationPage(Hook.driver);
    }

    @When("completa el formulario con nombre {string}, apellido {string} y código postal {string}")
    public void completa_el_formulario_con_nombre_apellido_codigo_postal(String name,String lastName,String postalCode) throws InterruptedException {
        informationpage.setNameInput(name);
        informationpage.setLastNameInput(lastName);
        informationpage.setPostalCodeInput(postalCode);
        Thread.sleep(2000);
        informationpage.clickBtnContinue();
    }
}
