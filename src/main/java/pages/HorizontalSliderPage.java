package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        //первый способ через Action
       /* Actions move = new Actions(driver);
        move.moveToElement(moveSlider);
        Action action = move.dragAndDropBy(moveSlider, 30, 0).build();
        action.perform();*/

        // второй способ через Keys
        for (int i =0; i<8; i++){
            moveSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValueRange() {
        return driver.findElement(valueRange).getText();
    }

}
