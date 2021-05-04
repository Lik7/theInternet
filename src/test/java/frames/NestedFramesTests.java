package frames;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

public class NestedFramesTests extends BaseTest {

    @Test
    public void testMiddleFrame(){
        NestedFramesPage nestedFramesPage = homePage.clickIFrames();
        nestedFramesPage.switchToMiddleArea();
        Assert.assertEquals(nestedFramesPage.getFrameMiddleText(), "MIDDLE", "Wrong middle frame");
    }
    @Test
    public void testBottomFrame(){
        NestedFramesPage nestedFramesPage = homePage.clickIFrames();
        nestedFramesPage.switchToBottomArea();
        Assert.assertEquals(nestedFramesPage.getFrameBottomText(), "BOTTOM", "Wrong bottom frame");
    }
}
