package co.dlacademy;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.*;

public class Por extends org.openqa.selenium.By {

    public static org.openqa.selenium.By dataTest(String dataTest)
    {
        String elementDataTest = "//*[@data-test='"+dataTest+"']";
        return xpath(elementDataTest);
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        return null;
    }
}
