package Pages;

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
    private WebElement alertsFrameWindow;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy (xpath = "//h5[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement widgets;



    public void clickAlertWindow() {
        alertsFrameWindow.click();
    }

    public void clickForms(){
        forms.click();
    }

    public void clickElements(){
        elements.click();
    }

    public void clickWidgets(){
        widgets.click();
    }


}
