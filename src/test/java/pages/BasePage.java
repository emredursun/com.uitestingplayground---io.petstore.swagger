package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class BasePage {
    public WebElement getElementWithText(String elText){
        return Driver.getDriver()
                .findElement(By.xpath(String.format("//*[text()='%s']", elText)));
    }

    public WebElement getElementContainsText(String elText){
        return Driver.getDriver()
                .findElement(By.xpath(String.format("//*[contains(text(), '%s')]", elText)));
    }
}
