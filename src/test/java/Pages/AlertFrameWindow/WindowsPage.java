package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private  WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interractTab(){
        newTabButton.click();
        LoggerUtility.info("The user clicks on interractTab button");

        windowMethods.switchToSpecificWindow(1);
        LoggerUtility.info("The user switches to a new tab");

        windowMethods.closeCurrentWindow();
        LoggerUtility.info("The user closes the current tab");

        windowMethods.switchToSpecificWindow(0);
        LoggerUtility.info("The user switches back to the main tab");

//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());  //lista de tab-uri
//        driver.switchTo().window(tabs.get(1));  // ne mutam cu focusul pe un tab nou deschis
//        System.out.println("Url: " + driver.getCurrentUrl());  //pozitia tab-ului pe care dorim sa mergem
//        driver.close(); //inchidem tab-ul curent iar cu quit se inchid toate tab-urile
//        driver.switchTo().window(tabs.get(0));
    }

    public void interractWindow(){
        newWindowButton.click();
        LoggerUtility.info("The user clicks on interractWindow button");

        windowMethods.switchToSpecificWindow(1);
        LoggerUtility.info("The user switches to a new window");

        windowMethods.closeCurrentWindow();
        LoggerUtility.info("The user closes the current window");

        windowMethods.switchToSpecificWindow(0);
        LoggerUtility.info("The user switches back tot the main window");

//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> windows = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windows.get(1));
//        System.out.println("Url: " + driver.getCurrentUrl());
//        driver.close();
//        driver.switchTo().window(windows.get(0));
    }
}
