package navigation;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTest {

    @Test
    public void testsNavigation(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goToURL("https://tut.by");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickHereLink();
        getWindowManager().switchToTab("New Window");
    }
}
