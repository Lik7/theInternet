package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    WebDriver driver;
    //WebElement slider = driver.findElement(By.cssSelector(".sliderContainer > input"));
    By slider = By.cssSelector(".sliderContainer > input");
    By valueRange = By.cssSelector("div > #range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

   /* public void clickSlider() {
        driver.findElement(slider).click();
    }*/

    public void moveSlider() {
        WebElement moveSlider = driver.findElement(slider);
        Actions move = new Actions(driver);
        move.moveToElement(moveSlider);
        Action action = move.dragAndDropBy(moveSlider, 30, 0).build();
        action.perform();
    }

    public String getValueRange() {
        return driver.findElement(valueRange).getText();
    }
    
}
