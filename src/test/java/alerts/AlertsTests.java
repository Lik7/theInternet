package alerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTest {

    @Test
    public void testAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickAlertButton();
        alertsPage.acceptPopup();
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Error Alert");
    }

    @Test
    public void testConfirm() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickConfirmButton();
        String confirmText = alertsPage.getConfirmText();
        alertsPage.dismissPopup();
        Assert.assertEquals(confirmText, "I am a JS Confirm", "Error Confirm");
        Assert.assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Error Confirm");
    }

    @Test
    public void testPrompt() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickPromptButton();
        String text = "Hey there!";
        alertsPage.setPromtInput(text);
        alertsPage.acceptPopup();
        Assert.assertEquals(alertsPage.getResultText(), "You entered: " + text, "Error Prompt");
    }
}
