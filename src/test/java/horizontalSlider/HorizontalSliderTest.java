package horizontalSlider;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    private String resultMoveSlider = "4";

    @Test
    public void testHorizontalSlide(){
        HorizontalSliderPage horizontalSlider = homePage.clickHorizontalSlider();
       // horizontalSlider.clickSlider();
        horizontalSlider.moveSlider();
        Assert.assertEquals(horizontalSlider.getValueRange(), resultMoveSlider, "Слайдер не передвинут на значение " + resultMoveSlider);
    }

}
