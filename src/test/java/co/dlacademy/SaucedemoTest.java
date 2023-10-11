package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoTest {

    @Test
    public void loginEnSaucedemoExitosoConAtributos(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.saucedemo.com/");

        chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).click();
        chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).sendKeys("standard_user");
        chromeDriver.findElement(org.openqa.selenium.By.id("password")).click();
        chromeDriver.findElement(org.openqa.selenium.By.name("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(org.openqa.selenium.By.id("login-button")).click();

        chromeDriver.close();
    }


    @Test
    public void loginEnSaucedemoExitosoConDatates(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.saucedemo.com/");

        chromeDriver.findElement(Por.dataTest("username")).click();
        chromeDriver.findElement(Por.dataTest("username")).sendKeys("standard_user");
        chromeDriver.findElement(Por.dataTest("password")).click();
        chromeDriver.findElement(Por.dataTest("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(Por.dataTest("login-button")).click();

        chromeDriver.close();
    }
}
