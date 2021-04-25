package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTest {

    private WebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(); //запускаем драйвер Хрома
        driver.manage().window().maximize();
        goHome();
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
}
//driver.get(link);
//System.out.println("Page tittle is " + driver.getTitle());
//driver.navigate().to(link);
//driver.manage().window().setSize(new Dimension(360, 720));
