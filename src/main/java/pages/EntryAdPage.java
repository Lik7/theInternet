package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    WebDriver driver;

   /* private By modalText = By.cssSelector(".modal-title > h3");
    private By closeLink = By.cssSelector(".modal-footer > p");
    private By modalWindow = By.id("modal");*/
    @FindBy(css = ".modal-title > h3")
    private WebElement modalText;
    @FindBy(css = ".modal-footer > p")
    private WebElement closeLink;
    @FindBy(id = "modal")
    private WebElement modalWindow;

    /*public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }*/
    public EntryAdPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void clickModal(){
        closeLink.click();
    }

    public String getModalTitle(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(modalWindow));
        return modalText.getText();
    }
}
