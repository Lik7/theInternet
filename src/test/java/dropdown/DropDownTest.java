package dropdown;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropDownTest extends BaseTest {
    @Test
    public void testSelectedOption() {

        DropdownPage dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);

        List<String> selectedOptions = dropdownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1, "Wrong number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
