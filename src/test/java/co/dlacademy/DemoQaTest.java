package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoQaTest {
    WebDriver chromeDriver;
    @Test
    public void esperas() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        chromeDriver.get("https://demoqa.com/progress-bar");
        chromeDriver.findElement(By.id("startStopButton")).click();
       // Thread.sleep(4000);
        chromeDriver.findElement(By.id("resetButton")).click();
        //chromeDriver.close();
    }
}
