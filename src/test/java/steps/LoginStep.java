package steps;

import Pages.LoginPage;
import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStep {

    public LoginPage loginpage;

    public LoginStep() {
        this.loginpage = new LoginPage(Hook.driver);
    }

    @Given("que el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_inicio_de_sesion(){
        loginpage.navigateToUrl();
    }

    @When("inicia sesión con el usuario {string} y la contraseña {string}")
    public void inicia_sesion_con_el_usuario_y_contrasena(String user,String pass){
        loginpage.setUsernameField(user);
        loginpage.setPasswordField(pass);
        loginpage.clickBtnLogin();
    }

   @Then("el usuario deberia ver mensaje {string}")
    public void el_usuario_deberia_ver_mensaje(String alert){
       Assert.assertEquals(alert,loginpage.getErrorText());
   }


}
