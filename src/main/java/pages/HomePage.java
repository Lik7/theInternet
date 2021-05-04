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

    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts").click();
        return new AlertsPage(driver);
    }
    public FileUploaderPage clickFileUpload() {
        clickLink("File Upload").click();
        return new FileUploaderPage(driver);
    }
    public EntryAdPage clickEntryAd() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);//по сути возвр. объект другой (новой) страницы
    }
    public WysiwygEditorPage clickFrames() {
        clickLink("Frames").click();
        clickLink("iFrame").click();
        return new WysiwygEditorPage(driver);
    }
    public NestedFramesPage clickIFrames() {
        clickLink("Frames").click();
        clickLink("Nested Frames").click();
        return new NestedFramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeep() {
        clickLink("Large & Deep DOM").click();
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }
 public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }

}