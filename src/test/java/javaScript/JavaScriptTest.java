package javaScript;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testJS(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeep();
        largeAndDeepDomPage.scrollToTable();
    }
    @Test
    public void testScrollToParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
//добавить Assert
    }
}
