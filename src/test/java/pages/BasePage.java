package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class BasePage {

    // Locate any 'text' WebElement matching any expected 'text' value
    public WebElement getElementWithText(String elText){
        return Driver.getDriver()
                .findElement(By.xpath(String.format("//*[text()='%s']", elText)));
    }

    // Locate any 'text' WebElement containing any expected 'text' value
    public WebElement getElementContainsText(String elText){
        return Driver.getDriver()
                .findElement(By.xpath(String.format("//*[contains(text(), '%s')]", elText)));
    }
}
