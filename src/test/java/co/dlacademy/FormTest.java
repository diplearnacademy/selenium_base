package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {

    WebDriver chromeDriver;

    @Test
    public void testManejoSelects() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://automationtesting.co.uk/dropdown.html");
        Select listaCarros = new Select(chromeDriver.findElement(By.name("cars")));
        listaCarros.selectByValue("mercedes");
        if (chromeDriver.findElement(By.id("cb_red")).isSelected()){
            System.out.println("Elemento Seleccionado");
        }else{
            Thread.sleep(2000);
            chromeDriver.findElement(By.name("demo-priority")).click();
        }
        chromeDriver.close();
    }
}
