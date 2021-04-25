package login;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

@Test
    public void testSuccessfulLogin() {

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPasswordWord("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        Assert.assertEquals(secureAreaPage.getMessege(), "You logged into a secure area!\n×", "Test is fail");
    }
}
