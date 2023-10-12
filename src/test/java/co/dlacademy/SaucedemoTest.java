package co.dlacademy;

import co.dlacademy.page_object.Por;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static co.dlacademy.utils.HandlerData.convertirStringDobleSinSigno;

public class SaucedemoTest {
    WebDriver chromeDriver;

    @BeforeEach
    public void abrirNavegador(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginEnSaucedemoExitosoConAtributos(){
        //chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).click();
        chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).sendKeys("standard_user");
        //chromeDriver.findElement(org.openqa.selenium.By.id("password")).click();
        chromeDriver.findElement(org.openqa.selenium.By.name("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(org.openqa.selenium.By.id("login-button")).click();
        chromeDriver.close();
    }

    @Test
    public void loginEnSaucedemoExitosoConDatates(){
        chromeDriver.findElement(Por.dataTest("username")).sendKeys("standard_user");
        chromeDriver.findElement(Por.dataTest("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(Por.dataTest("login-button")).click();
        chromeDriver.close();
    }

    @Test
    public void agregarProductosLista(){
        String precioPorProducto;
        chromeDriver.findElement(org.openqa.selenium.By.id("user-name")).sendKeys("standard_user");
        chromeDriver.findElement(org.openqa.selenium.By.name("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(org.openqa.selenium.By.id("login-button")).click();

        List<WebElement> listaProductos = chromeDriver.findElements(By.className("inventory_item"));

        for (int i = 0; i < listaProductos.size(); i++){
            precioPorProducto = listaProductos.get(i).findElement(By.className("inventory_item_price")).getText();
            if (convertirStringDobleSinSigno(precioPorProducto) <= 20.00){
                listaProductos.get(i).findElement(By.xpath(".//button")).click();
            }
        }
        chromeDriver.close();
    }
}
