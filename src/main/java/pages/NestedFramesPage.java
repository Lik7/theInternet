package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;

    String frameTopName = "frame-top";
    String frameBottom = "frame-bottom";
    String frameMiddleName = "frame-middle";
    By textMiddle = By.id("content");
    By textBottom = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToMiddleArea(){
        driver.switchTo().frame(frameTopName);
        driver.switchTo().frame(frameMiddleName);
    }

    public void switchToBottomArea(){
        driver.switchTo().frame(frameBottom);
    }

    public String getFrameMiddleText(){
        return driver.findElement(textMiddle).getText();
    }
    public String getFrameBottomText(){
        return driver.findElement(textBottom).getText();
    }
}
