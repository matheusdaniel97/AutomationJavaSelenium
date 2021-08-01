package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da QAzando$")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
    }

    /*@Quando("^preencho o email com {string}$")
    public void preencho_o_email_com(String email) throws Throwable {
        homePage.preencherEmail(email);
    }*/

    @Quando("^preencho o email com \"([^\"]*)\"$")
    public void preencho_o_email_com(String email){
        homePage.preencherEmail(email);
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws InterruptedException {
        homePage.scrollTo(driver.findElement(By.id("button")));
        homePage.clicarGanharCupom();
    }

    @Então("^devo visualizar o codigo de desconto$")
    public void devo_visualizar_o_codigo_de_desconto(){
        homePage.validarCupom("QAZANDO15OFF");
    }
}
