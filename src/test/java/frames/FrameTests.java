package frames;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FrameTests extends BaseTest {

    @Test
    public void testEditor(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickFrames();
        wysiwygEditorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "world!";
        wysiwygEditorPage.sendTextToTextArea(text1);
        wysiwygEditorPage.increseTndent();
        wysiwygEditorPage.sendTextToTextArea(text2);
        Assert.assertEquals(wysiwygEditorPage.getTextAreaContent(), text1 + text2, "Wrong text in text area");
    }
}
