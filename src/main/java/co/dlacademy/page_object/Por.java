package co.dlacademy.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Por extends By {

    public static org.openqa.selenium.By dataTest(String dataTest){
        String elementDataTest = "//*[@data-test='"+dataTest+"']";
        return org.openqa.selenium.By.xpath(elementDataTest);
    }
    @Override
    public List<WebElement> findElements(SearchContext context) {
        return null;
    }
}
