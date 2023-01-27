package utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Selenium {
    private Selenium(){}

    public static boolean isElementDisplayed(WebElement el){
        try{
            return el.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
