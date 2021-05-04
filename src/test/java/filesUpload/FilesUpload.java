package filesUpload;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

public class FilesUpload extends BaseTest {
    @Test
    public void testFileUpload(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUpload();
        fileUploaderPage.uploadFile("D:/HWAT/theInternet/src/test/resources/chromedriver.exe");
        Assert.assertEquals(fileUploaderPage.getUploadFiles(), "chromedriver.exe", "Error upload");
    }
}
