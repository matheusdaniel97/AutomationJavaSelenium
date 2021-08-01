package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br/curso.html");
        esperarElementClicavel(By.id("qazando-name-header"), 10);
        Assert.assertEquals("Não acessou a aplicação", true, driver.findElement(By.id("qazando-name-header")).isDisplayed());
    }

    public void scrollTo(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); //JS code to scroll page
        Thread.sleep(2000); //Time to scroll
    }

    public void preencherEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void clicarGanharCupom(){
        driver.findElement(By.id("button")).click();
    }

    public void validarCupom(String cupom){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals(cupom, texto_cupom);
    }

}
