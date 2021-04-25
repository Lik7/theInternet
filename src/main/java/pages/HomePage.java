package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent() {
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown").click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

}