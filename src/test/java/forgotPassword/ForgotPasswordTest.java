package forgotPassword;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmail("qwe@asd.zx");
        ForgotPasswordPage.ForgotPasswordResultPage forgotPasswordResultPage = forgotPassword.clickRetrievePasswordButton();// и создаем объект новой страницы
        forgotPasswordResultPage.QgetErrorText();
        Assert.assertEquals(forgotPassword.getErrorText(), "Internal Server Error", "Нет перехода на страницу результата восстановления пароля");
    }
}