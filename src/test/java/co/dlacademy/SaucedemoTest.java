package co.dlacademy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class SaucedemoTest {

    private WebDriver msEdgeDriver;

    @BeforeEach
    void localizarDriver()
    {
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");//Localizar el webdriver
        msEdgeDriver = new EdgeDriver();//crear el objeto webdriver (abrir el navegador)
        msEdgeDriver.manage().window().maximize();//
        msEdgeDriver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginEnSaucedemoExistoso() throws InterruptedException {


        msEdgeDriver.findElement(By.id("user-name")).click();
        msEdgeDriver.findElement(Por.dataTest("username")).sendKeys("standard_user");
        msEdgeDriver.findElement(By.id("password")).click();
        msEdgeDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        msEdgeDriver.findElement(By.id("password")).submit();
        //Thread.sleep(3000); pausar para poder ver :v <---- no hacer nunca
        //msEdgeDriver.close();
        //msEdgeDriver.quit();


        //Por es una clase abstracta

    }

    @Test
    void comprarUnProductoBarato()
    {
        //login
        msEdgeDriver.findElement(Por.dataTest("username")).sendKeys("standard_user");
        msEdgeDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        msEdgeDriver.findElement(By.id("password")).submit();
        //seleccionar producto
        msEdgeDriver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        msEdgeDriver.findElement(By.id("shopping_cart_container")).click();
        msEdgeDriver.findElement(Por.dataTest("checkout")).click();
        //formulario
        msEdgeDriver.findElement(Por.dataTest("firstName")).sendKeys("Juan");
        msEdgeDriver.findElement(Por.dataTest("lastName")).sendKeys("Apellido");
        msEdgeDriver.findElement(Por.dataTest("postalCode")).sendKeys("12345");
        msEdgeDriver.findElement(Por.dataTest("continue")).click();
        msEdgeDriver.findElement(Por.dataTest("finish")).click();
        String mensajeExito = msEdgeDriver.findElement(By.className("title")).getText();

        Assertions.assertEquals("Checkout: Complete!", mensajeExito);
        //msEdgeDriver.close();
        msEdgeDriver.quit();
    }

    @Test
    void ordenarPreciosDeProductos()
    {
        String precioProducto;
        float valorPrecioProducto;
        //login
        msEdgeDriver.findElement(Por.dataTest("username")).sendKeys("standard_user");
        msEdgeDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        msEdgeDriver.findElement(By.id("password")).submit();

        List<WebElement> precioProductos = msEdgeDriver.findElements(By.className("inventory_item"));

        for (WebElement producto : precioProductos)
        {
            precioProducto = producto.findElement(By.className("inventory_item_price")).getText();
            valorPrecioProducto = Float.parseFloat(precioProducto.substring(1));

            if (valorPrecioProducto <= 20.0)
            {
                producto.findElement(By.xpath(".//button")).click(); //update
                System.out.println(valorPrecioProducto);
            }
        }


    }
}
