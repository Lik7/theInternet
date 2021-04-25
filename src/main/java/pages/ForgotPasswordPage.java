package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.xpath("//*[text()='Retrieve password']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    //возвращает текст Internal Server Error
    public String getErrorText() {
        return driver.findElement(By.xpath("//*[text()='Internal Server Error']")).getText();
    }

    public ForgotPasswordResultPage clickRetrievePasswordButton() {
        driver.findElement(retrievePasswordButton).click();
        return new ForgotPasswordResultPage(driver);
    }
}

   /* public class ForgotPasswordResultPage {

        WebDriver driver;
        //private By errorText = By.xpath("//*[text()='Internal Server Error']");

        public ForgotPasswordResultPage(WebDriver driver) {
            this.driver = driver;
        }

        //возвращает текст Internal Server Error
        public String getErrorText() {
            return driver.findElement(By.xpath("//*[text()='Internal Server Error']")).getText();
        }
    }
}*/