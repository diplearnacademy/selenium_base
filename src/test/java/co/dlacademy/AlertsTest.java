package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsTest {
    WebDriver chromeDriver;

    @Test
    public void testCargarBarraProgresoTimeoutImplicito() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://demoqa.com/alerts");
        chromeDriver.findElement(By.id("confirmButton")).click();

        Alert alertConfirmacion = chromeDriver.switchTo().alert();
        alertConfirmacion.accept();
        chromeDriver.close();
    }

}
