package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {


    @Test
    public void testmethod() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();


        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();

        FramePage framePage = new FramePage(getDriver());
        framePage.interractFirstIFrame();
        framePage.interractSecondIFrame();


    }
}
