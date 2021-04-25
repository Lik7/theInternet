package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordResultPage {

    private  WebDriver driver;
    //private By errorText = By.xpath("//*[text()='Internal Server Error']");

    public ForgotPasswordResultPage(WebDriver driver) {
        this.driver = driver;
    }

    //возвращает текст Internal Server Error
    public String getErrorText() {
        return driver.findElement(By.xpath("//*[text()='Internal Server Error']")).getText();
    }

}
