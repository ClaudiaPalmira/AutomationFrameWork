package Tests;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AlertFrameWindow.WindowsPage;
import ShareData.ShareData;
import ShareData.Hooks;

import org.testng.annotations.Test;

public class WindowTest extends Hooks {


    @Test
    public void testmethod() {


        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        //WebElement browserWindows = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        //browserWindows.click();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickWindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interractTab();
        windowsPage.interractWindow();

       // WebElement newTabButton = getDriver().findElement(By.id("tabButton"));
        //newTabButton.click();

        //System.out.println("Url: " + getDriver().getCurrentUrl());


       // List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());  //lista de tab-uri
        //getDriver().switchTo().window(tabs.get(1));  // ne mutam cu focusul pe un tab nou deschis

        //System.out.println("Url: " + getDriver().getCurrentUrl());  //pozitia tab-ului pe care dorim sa mergem

        //getDriver().close(); //inchidem tab-ul curent iar cu quit se inchid toate tab-urile
       // getDriver().switchTo().window(tabs.get(0));


       // WebElement newWindowButton = getDriver().findElement(By.id("windowButton"));
       // newWindowButton.click();

        //System.out.println("Url: " + getDriver().getCurrentUrl());


        //List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
       // getDriver().switchTo().window(windows.get(1));

        //System.out.println("Url: " + getDriver().getCurrentUrl());

        //getDriver().close();
      // getDriver().switchTo().window(windows.get(0));













    }
}
