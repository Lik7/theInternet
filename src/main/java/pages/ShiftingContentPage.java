package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    WebDriver driver;
    private By menuElementButton =By.cssSelector(".example a:nth-child(3)");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    //следующая страница
    public ShiftingContentMenuPage clickMenuElementButton(){
        driver.findElement(menuElementButton).click();
        return new ShiftingContentMenuPage(driver);
    }
}
