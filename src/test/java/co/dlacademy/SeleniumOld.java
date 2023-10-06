package co.dlacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumOld {

    @Test
    void manageDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        // capabilities Selenium 3
        //DesiredCapabilities caps = DesiredCapabilities.chrome();
        // caps.setCapability("version","117");
        // se debe pasar el parametor caps al ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window();

    }


    @Test
    void openWithDimantions() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);

    }
}
