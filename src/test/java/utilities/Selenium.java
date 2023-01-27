package utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Selenium {
    private Selenium(){}

    // Check if there are any displayed elements matching the given WebElement
    // and handel if there are any exceptions with try & catch
    public static boolean isElementDisplayed(WebElement el){
        try{
            return el.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
