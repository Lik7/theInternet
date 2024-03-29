package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;

    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private final By example2Link = By.linkText("Example 2: Element rendered after the fact");


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1() {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }

    public Example2Page clickExample2Link() {
        driver.findElement(example2Link).click();
        return new Example2Page(driver);
    }

    // ctrl+click test
    private final By startButton = By.cssSelector("#start button");
    public void ctrllickExample2Link() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).click(driver.findElement(example2Link)).perform();
    }
    public Boolean checkStartButtonPresence() {
        return driver.findElement(startButton).isDisplayed();
    }

    public class Example1Page {
        WebDriver driver;

        private By startButton = By.cssSelector("#start button");
        private By loadingIndicator = By.id("loading");
        private By finishText = By.id("finish");

        public Example1Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStartButton() {
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 8);
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        }

        public String getFinishText() {
            return driver.findElement(finishText).getText();
        }
    }

    public static class Example2Page {

        private final WebDriver driver;
        private final By startButton = By.cssSelector("#start button");
        private final By loadedText = By.id("finish");

        public Example2Page(WebDriver driver) {
            this.driver = driver;
        }

        // loadedText element is absent, may not be checked immediately because it needs time to appear
        public void clickStartButton() {
            driver.findElement(startButton).click();
            WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
        }

        public String getLoadedText() {
            return driver.findElement(loadedText).getText();
        }
    }

}
