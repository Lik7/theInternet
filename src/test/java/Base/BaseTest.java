package Base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTest {

    private EventFiringWebDriver driver;
    //private WebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver(); //запускаем драйвер Хрома
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));//запускаем драйвер Хрома
        driver.register(new EventReporter());

        driver.manage().window().maximize();
        goHome();
        setCookie();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get(link);
    }

    @AfterClass
    public void tearDone() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public WindowManager getWindowManager() { //создает объект класса WindowManager чтобы сразу использовать в тесте
        return new WindowManager(driver);
    }

    //метод делает скриншот
    public void takeScreenshot(ITestResult result) throws IOException {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        System.out.println(screenshot.getAbsolutePath());

        Files.move(screenshot, new File("src/test/resources/screenshots/screen_" + result.getName() + ".png"));//из пакета com.google.common.io
    }

    //скриншот если тест упал
    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot(result);
        }
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //chromeOptions.setHeadless(true);//запускает тест без отобр. браузера
        return chromeOptions;
    }

    private void setCookie(){
        Cookie cookie = new Cookie
                .Builder("Stormnet", "1234")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
        driver.manage().deleteCookieNamed("optimizelyBuckets");
    }
}
//driver.get(link);
//System.out.println("Page tittle is " + driver.getTitle());
//driver.navigate().to(link);
//driver.manage().window().setSize(new Dimension(360, 720));
