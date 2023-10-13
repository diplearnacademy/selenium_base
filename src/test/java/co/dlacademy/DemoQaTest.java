package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQaTest {
    WebDriver chromeDriver;

    @Test
    public void testCargarBarraProgresoTimeoutImplicito() throws InterruptedException {
        String barraProgreso;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));
        chromeDriver.get("https://demoqa.com/progress-bar");
        chromeDriver.findElement(By.id("startStopButton")).click();
        barraProgreso = chromeDriver.findElement(By.xpath("//div[@role='progressbar' and contains(.,'100')]")).getText();
        System.out.println(barraProgreso);
        // Thread.sleep(4000); //Mala practica, No usar.
        chromeDriver.findElement(By.id("resetButton")).click();
        chromeDriver.close();
    }


    @Test
    public void testCargarBarraProgresoTimeoutExplicito() throws InterruptedException {
        String barraProgreso;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();

        WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofMillis(12000));

        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        chromeDriver.get("https://demoqa.com/progress-bar");
        chromeDriver.findElement(By.id("startStopButton")).click();

        barraProgreso = explicitWait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='progressbar' and contains(.,'100')]")))
                .getText();

        System.out.println(barraProgreso);
        chromeDriver.findElement(By.id("resetButton")).click();
        chromeDriver.close();
    }




}
