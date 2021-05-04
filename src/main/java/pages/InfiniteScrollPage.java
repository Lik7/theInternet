package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    WebDriver driver;

    private By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    //window.scrollTo(0, document.body.scrollHeight)
// 1- based index
    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        while (getParagraphCount() < index) {
            javascriptExecutor.executeScript(script);
        }
    }

    public int getParagraphCount() {
        return driver.findElements(textBlock).size();
    }
}
