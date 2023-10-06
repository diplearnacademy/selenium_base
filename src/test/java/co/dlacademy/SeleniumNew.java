package co.dlacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumNew {

    private WebDriver driver;

    @BeforeEach
    void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("117");
         driver = new ChromeDriver(chromeOptions);
    }

    @Test
    void manageDriver(){
        driver.manage().window();

    }

    @Test
    void openWithDimantions(){
        Dimension dimension = new Dimension(1024,768);
        driver.manage().window().setSize(dimension);

    }


}
