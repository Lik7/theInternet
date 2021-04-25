package keys;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keysPresses = homePage.clickKeyPresses();
        keysPresses.enterText("Hello World!" + Keys.BACK_SPACE);
        Assert.assertEquals(keysPresses.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testShortcuts(){
        KeyPressesPage keysPresses = homePage.clickKeyPresses();
        keysPresses.enterText("Hello World!" + Keys.chord(Keys.CONTROL, "z"));
        Assert.assertEquals(keysPresses.getTargetValue(), "Hello World");
    }
}
