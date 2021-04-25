package shiftingContent;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentMenuPage;
import pages.ShiftingContentPage;

public class ShiftingContentMenuElementTest extends BaseTest {

    @Test
    public void testOpenShiftingContentPage(){
        ShiftingContentPage shiftingContent = homePage.clickShiftingContent();
        ShiftingContentMenuPage shiftingContentMenuPage = shiftingContent.clickMenuElementButton();
        Assert.assertEquals(shiftingContentMenuPage.quantityliLinks(), 5, "Wrong number of selected");
    }

}
