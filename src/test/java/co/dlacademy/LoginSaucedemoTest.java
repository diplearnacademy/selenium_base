package co.dlacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSaucedemoTest {
    WebDriver chromeDriver;
    WebElement inputUsuario = chromeDriver.findElement(By.id("user-name"));
    WebElement inputClave = chromeDriver.findElement(By.name("password"));
    WebElement buttonLogin = chromeDriver.findElement(By.id("login-button"));

    @BeforeEach
    public void abrirNavegador(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.saucedemo.com/");
    }

    //Referencia de metodo sin reusar los webelement globales.
    @Test
    public void loginEnSaucedemoExitosoConAtributos(){
        chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).sendKeys("standard_user");
        chromeDriver.findElement(org.openqa.selenium.By.name("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(org.openqa.selenium.By.id("login-button")).click();
        chromeDriver.close();
    }

    //Metodos usando los webelement globales
    @Test
    public void loginEnSaucedemoExitosoConDatates(){
        inputUsuario.sendKeys("standard_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();
        chromeDriver.close();
    }

    @Test
    public void loginEnSaucedemoBloqueadoConDatates(){
        inputUsuario.sendKeys("locked_out_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();
        chromeDriver.close();
    }

    @Test
    public void loginEnSaucedemoProblemasDatates(){
        inputUsuario.sendKeys("problem_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();
        chromeDriver.close();
    }

    @Test
    public void loginEnSaucedemoPerformConDatates(){
        inputUsuario.sendKeys("performance_glitch_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();
        chromeDriver.close();
    }

    @Test
    public void loginEnSaucedemoErrorConDatates(){
        inputUsuario.sendKeys("error_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();
        chromeDriver.close();
    }

}
