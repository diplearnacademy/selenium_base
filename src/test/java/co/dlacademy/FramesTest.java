package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

    WebDriver chromeDriver;

    @Test
    public void testInteractuarConIframes() {
        String textoIframe;
        String textoFooter;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://demoqa.com/frames");
        chromeDriver.switchTo().frame("frame1");
        textoIframe = chromeDriver.findElement(By.id("sampleHeading")).getText();
        System.out.println(textoIframe);
        chromeDriver.switchTo().defaultContent();
        textoFooter = chromeDriver.findElement(By.xpath("//footer//span")).getText();
        System.out.println(textoFooter);
        chromeDriver.close();
    }
}
