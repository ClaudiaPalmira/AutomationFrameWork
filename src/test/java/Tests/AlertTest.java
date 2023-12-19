package Tests;

import ObjectData.AlertObject;
import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import ShareData.Hooks;

import org.testng.annotations.Test;

public class AlertTest extends Hooks {


    @Test
    public void testmethod() {

        AlertObject alertObject = new AlertObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interractAlertOK();

        alertPage.interractAlertDelay();

        alertPage.interractAlertDismiss();

        alertPage.interractAlertValue(alertObject);

//        alertPage.interractAlertValue("tralala");

    }

}
