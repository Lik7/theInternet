package modals;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalTests extends BaseTest {
    @Test
    public void testModal(){
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        Assert.assertEquals(entryAdPage.getModalTitle(),"THIS IS A MODAL WINDOW","Error modal window");
        entryAdPage.clickModal();
    }

}
