package steps;

import Pages.OverviewPage;
import hooks.Hook;
import io.cucumber.java.en.When;

public class OverviewStep {

    public OverviewPage overviewpage;
    public OverviewStep(){
        this.overviewpage = new OverviewPage(Hook.driver);
    }

    @When("finaliza la compra")
    public void confirma_el_proceso_de_compra(){
        overviewpage.clickBtnFinish();
    }
}
