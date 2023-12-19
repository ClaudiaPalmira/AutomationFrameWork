package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertsFrameWindow;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy (xpath = "//h5[text()='Elements']")
    private WebElement elements;

//    @FindBy(xpath = "//h5[text()='Widgets']")
//    private WebElement widgets;



    public void clickAlertWindow() {
        alertsFrameWindow.click();
        LoggerUtility.info("The user clicks on alertsFrameWindow button");
    }

    public void clickForms(){
        forms.click();
        LoggerUtility.info("The user clicks on forms button");
    }

    public void clickElements(){
        elements.click();
        LoggerUtility.info("The user clicks on elements button");
    }

//    public void clickWidgets(){
//        widgets.click();
//    }


}
